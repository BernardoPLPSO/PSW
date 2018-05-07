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
        Orcamento orcamentoEscolhido;
        ArrayList<ContaOrcamento> contaOrcamento = (ArrayList<ContaOrcamento>)req.getServletContext().getAttribute("contaOrcamento");
        System.out.println(contaOrcamento.get(0).getNome()+"ABC/n");
        if(!codigo.isEmpty() && !((String)req.getParameter("realizado")).isEmpty() && realizado >= 0){
            for(ContaOrcamento o : contaOrcamento){
                if(o.getCodigo().equals(codigo)){
                    o.setValorRealizado(realizado);
                    req.getServletContext().setAttribute("msgErro","");
                }
                else if(o.getSubcontaOrcamento()!=null){
                    for(ContaOrcamento f : o.getSubcontaOrcamento()){
                        if(f.getCodigo().equals(codigo)){
                            f.setValorRealizado(realizado);
                            req.getServletContext().setAttribute("msgErro","");
                        }
                    }
                }
                else{
                    String msgErro = "O valor realizado deve existir e o codigo deve ser um dos representados na tabela";
                    req.getServletContext().setAttribute("msgErro",msgErro);
                }
            }
        }
        else{
            String msgErro = "Ambos valores devem estar preenchidos";
            req.getServletContext().setAttribute("msgErro",msgErro);
        }
        req.getRequestDispatcher("tabela.jsp").forward(req, resp);
    }
}
