/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirlimpimposo.prova_psw_resolvida;

import java.util.ArrayList;

/**
 *
 * @author Pirlimpimposo
 */
public class Orcamento extends PlanoDeContas{
    private int ano;
    private ArrayList<ContaOrcamento> contasOrcamento; 
    
    /**Método responsável pela criação de uma instancia do objeto orçamento
     * 
     * @param nome - nome do orçamento
     * @param ano - ano do orçamento
     */
    public Orcamento(String nome, int ano) {
        super(nome);
        this.ano = ano;
    }

    /**Método responsável pela criação de uma instancia do objeto orçamento
     * 
     * @param nome - nome do orçamento
     * @param ano - ano do orçamento
     * @param contasOrcamento - lista de contas de orçamento do orçamento
     */
    public Orcamento(String nome, int ano, ArrayList<ContaOrcamento> contasOrcamento) {
        super(nome);
        this.ano = ano;
        this.contasOrcamento = contasOrcamento;
    }
    
    /**Método que retorna ano do orçamento
     * 
     * @return int - ano do orçamento
     */
    public int getAno() {
        return ano;
    }

    /**Método que retorna lista com contas de orçamento de um orçamento
     * 
     * @return  ArrayList - lista de contas de orçamento
     * 
     */
    public ArrayList<ContaOrcamento> getContasOrcamento() {
        return contasOrcamento;
    }
}
