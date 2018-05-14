/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirlimpimposo.prova_psw_resolvida;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Classe responável pela tag personalizada que tem a funcionalidade de imprimir o conteúdo da tabela linha por linha
 *
 * @author Pirlimpimposo
 */
public class ImprimirTabelaTag extends SimpleTagSupport{
    private ContaOrcamento contaOrcamento;
    /**Tag personalizada que tem a funcionalidade de imprimir o conteúdo da tabela linha por linha
     * 
     * @throws JspException
     * @throws IOException 
     */
    @Override
    public void doTag() throws JspException, IOException {
        String tabelaHTML = imprimir(contaOrcamento);
        getJspContext().getOut().print(tabelaHTML);
    }
    /**Método que recebe uma conta de orçamento e organiza seus dados em forma de tabela html
     * 
     * @param o
     * @return String - uma linha da tabela html
     */
    public String imprimir(ContaOrcamento o){
        String resultado;
        String espacos = "";
        for(int i = 0; i < o.getCodigo().length(); i++){
            if((o.getCodigo()).charAt(i) == '.'){
                espacos = espacos.concat("&nbsp&nbsp");
            }
        }
            resultado = "<tr>"+
                        "<td>"+espacos+"<b>"+o.getCodigo()+".</b>"+o.getNome()+"</td>"+
                        "<td>"+o.getValorOrcado()+"</td>"+
                        "<td>"+o.getValorRealizado()+"</td>"+
                        "<td>"+o.getValorComprometido()+"</td>"+
                        "<td>"+o.getValorDisponivel()+"</td>"+
                        "</tr>";
        
        if(o.subcontaOrcamento != null){
            for(ContaOrcamento a:o.getSubcontaOrcamento())
                resultado = resultado.concat(imprimir(a)); 
        }

        return resultado;
    }
    /**Método que retorna a conta de orçamento
     * 
     * @return ContaOrcamento - Conta de orçamento
     */
    public ContaOrcamento getOrcamento() {
        return contaOrcamento;
    }
    
    /**Responsável por modificar a conta de orçamento 
     * 
     * @param orcamento - Conta de orçamento
     */
    public void setOrcamento(ContaOrcamento orcamento) {
        this.contaOrcamento = orcamento;
    }
}
