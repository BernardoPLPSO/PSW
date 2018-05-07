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
public class Conta {
    private String nome;
    private String codigo;
    private ArrayList<Conta> subconta;
    /**Método para criação de uma instancia do objeto Conta
     * 
     * @param nome - nome da conta
     * @param codigo - codigo da conta
     */
    public Conta(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    /** Método para criação de uma instancia do objeto Conta
     *
     * @param nome - nome da conta
     * @param codigo - codigo da conta
     * @param subconta - lista de subcontas da conta
     */
    public Conta(String nome, String codigo, ArrayList<Conta> subconta) {
        this.nome = nome;
        this.codigo = codigo;
        this.subconta = subconta;
    }
    
    
    /**Método para retorno do nome da conta
     * 
     * @return String - nome da conta
     */
    public String getNome() {
        return nome;
    }
    
    /**Método para retorno do código da conta
     * 
     * @return String - código da conta
     */
    public String getCodigo() {
        return codigo;
    }
    
    /**Método para retorno das subcontas presentes em uma conta
     *      
     * @return ArrayList - Lista de subcontas em uma conta
     */
    public ArrayList<Conta> getSubconta() {
        return subconta;
    }
}
