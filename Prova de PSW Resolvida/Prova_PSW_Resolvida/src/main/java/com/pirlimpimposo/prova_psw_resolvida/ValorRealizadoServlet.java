/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirlimpimposo.prova_psw_resolvida;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pirlimpimposo
 */
@WebServlet(name = "ValorRealizadoServlet", urlPatterns = {"/ValorRealizadoServlet"})
public class ValorRealizadoServlet extends HttpServlet{
    /**
     * Handles the HTTP <code>POST</code> method.
     * 
     * @param req - request do servidor
     * @param resp - resposta do servidor
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String codigo = (String)req.getParameter("codigo");
        float realizado;
        if(!((String)req.getParameter("realizado")).isEmpty()){
            realizado = Float.parseFloat((String)req.getParameter("realizado"));
        }else{
            realizado = 0;
        }
        ArrayList<ContaOrcamento> contaOrcamento = (ArrayList<ContaOrcamento>)req.getServletContext().getAttribute("contaOrcamento");
        if(!codigo.isEmpty() && !((String)req.getParameter("realizado")).isEmpty() && realizado >= 0){
            String msgErro = validaServlet(contaOrcamento, codigo, realizado);
            req.getServletContext().setAttribute("msgErro",msgErro);
        }
        else{
            String msgErro = "Ambos valores devem estar preenchidos e o valor realizado deve ser positivo";
            req.getServletContext().setAttribute("msgErro",msgErro);
        }
        req.getRequestDispatcher("tabela.jsp").forward(req, resp);
    }
    /**Método responsável pela mudança no valor realizado na tabela, com recursividade
     * 
     * @param contaOrcamento - lista de contas de orçamento que é passada
     * @param codigo - codigo inserido no input da tabela
     * @param realizado - valor realizado a ser adicionado na conta, inserido no input da tabela
     * @return String - valor da mensagem de erro a ser dada
     */
    public String validaServlet(ArrayList<ContaOrcamento> contaOrcamento, String codigo, float realizado){
        String msgErro = "";
        for(ContaOrcamento o : contaOrcamento){
            if(o.getCodigo().equals(codigo)){
                if(o.getSubcontaOrcamento()==null){
                    System.out.println(o.getCodigo());
                    if((o.getValorDisponivel()-realizado)>= 0){
                        o.setValorRealizado(realizado);
                        msgErro = "Valor inserido com êxito";
                        return msgErro;
                    }
                    else{
                        msgErro = "O valor entrado tem que estar dentro dos limites do orçamento da conta";
                        return msgErro;
                    }
                }
                else{
                    msgErro = "A conta inserida deve ser uma 'folha da arvore', ou seja, para mudar o valor dela, ela não pode possuir subcontas";
                }
            }
            else if(o.getSubcontaOrcamento()!=null){
                msgErro = validaServlet(o.getSubcontaOrcamento(), codigo, realizado);
                if(msgErro.equals(""))
                    return msgErro;
            }
            else if(msgErro.equals("")){
                msgErro = "O codigo deve ser um dos representados na tabela";
            }
        }
        System.out.println(msgErro);
        return msgErro;
    }
}
