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
@WebServlet(name = "RequestServlet", urlPatterns = {"/RequestServlet"})
public class RequestServlet extends HttpServlet {
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req servlet req - request do servidor
     * @param resp servlet resp - response do servidor
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            ArrayList<Empresa> empresas = generateEmpresas();
            ArrayList<ContaOrcamento> contaOrcamentoEscolhida;
            Orcamento orcamentoEscolhido;
            String empresa1 = (String)req.getParameter("empresa");
            System.out.println(empresa1);
            int ano = Integer.parseInt((String)req.getParameter("ano"));
            for(Empresa empresa : empresas){
                if(empresa.getNome().equals(empresa1)){
                    for(Orcamento orcamento : empresa.getOrcamento()){
                        if(orcamento.getAno() == ano){
                            orcamentoEscolhido = orcamento;
                            contaOrcamentoEscolhida = orcamento.getContasOrcamento();
                            req.getServletContext().setAttribute("contaOrcamento", contaOrcamentoEscolhida);
                            req.getServletContext().setAttribute("orcamento", orcamentoEscolhido);
                            req.getRequestDispatcher("tabela.jsp").forward(req, resp);
                        }
                    }
                }
            }
            req.getRequestDispatcher("erro.jsp").forward(req, resp);
            
    }
    /**
     * Retorna uma arraylist preenchida com empresas pré-feitas, toda vez que o programa volta para esse servlet as empresas são reinciadas
     * 
     * @return ArrayList - lista de empresas criadas
     */
    public ArrayList<Empresa> generateEmpresas(){
        ContaOrcamento contaOrcamentoA = new ContaOrcamento("Despesas Gerais","1",1000,100,100);
        
        ContaOrcamento subContaOrcamentoB2 = new ContaOrcamento("Vendedores","2.2",2000,300,300);
        ContaOrcamento subcontaOrcamentoB3 = new ContaOrcamento("Vendedores Qualificados","2.1.1",700,300,300);
        ContaOrcamento subcontaOrcamentoB4 = new ContaOrcamento("Vendedores Normais","2.1.2",1500,300,300);
        ArrayList<ContaOrcamento> subcontasB1 = new ArrayList<ContaOrcamento>();
        subcontasB1.add(subcontaOrcamentoB3);
        subcontasB1.add(subcontaOrcamentoB4);
        ContaOrcamento subContaOrcamentoB1 = new ContaOrcamento("Admnistrativos","2.1",subcontasB1);
        ArrayList<ContaOrcamento> subcontasB = new ArrayList<ContaOrcamento>();
        subcontasB.add(subContaOrcamentoB1);
        subcontasB.add(subContaOrcamentoB2);
        ContaOrcamento contaOrcamentoC = new ContaOrcamento("Imprevistos","3", 2500, 450, 600);
        
        ContaOrcamento contaOrcamentoB = new ContaOrcamento("Folha Pagamento","2",subcontasB);
        
        ArrayList<ContaOrcamento> contasOrcamentoA = new ArrayList<ContaOrcamento>();
        contasOrcamentoA.add(contaOrcamentoA);
        contasOrcamentoA.add(contaOrcamentoB);
        contasOrcamentoA.add(contaOrcamentoC);
        
        Orcamento orcamentoA = new Orcamento("Orcamento 2018", 2018,contasOrcamentoA);
        ArrayList<Orcamento> orcamentosA = new ArrayList<Orcamento>();
        orcamentosA.add(orcamentoA);
        
        Orcamento orcamentoB = new Orcamento("Orcamento 2016", 2016, contasOrcamentoA);
        orcamentosA.add(orcamentoB);
        
                
        Empresa empresaA = new Empresa("Empresa A",orcamentosA);
        ArrayList<Empresa> empresas = new ArrayList<Empresa>();
        empresas.add(empresaA);
        
        return empresas;
    }
}
