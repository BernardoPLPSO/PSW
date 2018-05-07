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
public class Empresa {
    private String nome;
    private ArrayList<PlanoDeContas> planos;
    private ArrayList<Orcamento> orcamento;
    
    /**Método responsável pela criação de uma instancia do objeto empresa 
     * 
     * @param nome - nome da empresa
     */
    public Empresa(String nome) {
        this.nome = nome;
    }
    
    /** Método responsável pela criação de uma instancia do objeto empresa 
     *
     * @param nome - nome da empresa
     * @param orcamento - lista de orçamentos da empresa
     */
    public Empresa(String nome, ArrayList<Orcamento> orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
    }

    /** Método que retorna o nome da empresa
     *
     * @return String - nome da empresa
     */
    public String getNome() {
        return nome;
    }
    
    /**Método que retorna uma lista com os planos de conta da empresa
     * 
     * @return ArrayList - lista de planos de conta
     */
    public ArrayList<PlanoDeContas> getPlanos() {
        return planos;
    }
    
    /**Método que retorna uma lista com os orçamentos da empresa
     * 
     * @return ArrayList - lista de orçamentos
     */
    public ArrayList<Orcamento> getOrcamento() {
        return orcamento;
    }
}
