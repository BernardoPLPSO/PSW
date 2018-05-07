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
public class PlanoDeContas {
    private String nome;
    private ArrayList<Conta> contas;
    
    /**Método responsável pela criação de uma instancia do objeto plano de contas
     * 
     * @param nome - nome do plano de contas
     * @param contas - lista de contas dentro de um plano de contas
     */
    public PlanoDeContas(String nome, ArrayList<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }
    
    /**Método para retorno do nome do plano de contas
     *
     * @param nome - nome do plano de contas
     */
    public PlanoDeContas(String nome) {
        this.nome = nome;
    }
    
    /** Método para retorno do nome do plano de contas
     *
     * @return String - nome do plano de contas
     */
    public String getNome() {
        return nome;
    }

    /**Método para retorno de uma lista de contas pertencentes ao plano de contas

     * @return ArrayList - lista de contas do plano de contas
     */
    public ArrayList<Conta> getContas() {
        return contas;
    }
}
