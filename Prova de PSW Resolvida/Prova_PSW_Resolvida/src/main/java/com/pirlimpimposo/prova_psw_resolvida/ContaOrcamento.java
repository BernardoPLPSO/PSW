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
public class ContaOrcamento extends Conta{
    float valorOrcado;
    float valorRealizado;
    float valorComprometido;
    float valorDisponivel;
    ArrayList<ContaOrcamento> subcontaOrcamento;
    
    /**
     * Método para criação de uma instancia do objeto ContaOrcamento
     * 
     * @param nome - nome da conta de orçamento
     * @param codigo - codigo da conta de orçamento
     * @param valorOrcado - valor orçado da conta de orçamento
     * @param valorRealizado - valor realizado da conta de orçamento
     * @param valorComprometido - valor comprometido da conta de orçamento
     */
    public ContaOrcamento(String nome, String codigo, float valorOrcado, float valorRealizado, float valorComprometido) {
        super(nome,codigo);
        this.valorOrcado = valorOrcado;
        this.valorRealizado = valorRealizado;
        this.valorComprometido = valorComprometido;
    }
    
    /**
     * Método para criação de uma instancia do objeto ContaOrcamento
     * 
     * @param nome - nome da conta de orçamento
     * @param codigo - codigo da conta de orçamento
     * @param subcontaOrcamento - lista de subcontas de orçamento
     */
    public ContaOrcamento(String nome, String codigo, ArrayList<ContaOrcamento> subcontaOrcamento) {
        super(nome,codigo);
        this.subcontaOrcamento = subcontaOrcamento;
    }
    /**
     * Método para retorno do valor orçado
     * 
     * @return float - Valor orçado
     */
    public float getValorOrcado() {
        float valorOrcadoSubconta = 0;
        if(subcontaOrcamento == null){
            return valorOrcado;
        }
        else{
            for(ContaOrcamento a : subcontaOrcamento){
                valorOrcadoSubconta += a.getValorOrcado();
            }
            return valorOrcadoSubconta + valorOrcado;
        }
    }

    /**
     * Método para retorno do valor realizado
     * 
     * @return float - Valor realizado
     */
    public float getValorRealizado() {
        float valorRealizadoSubconta = 0;
        if(subcontaOrcamento == null){
            return valorRealizado;
        }
        else{
            for(ContaOrcamento a : subcontaOrcamento){
                valorRealizadoSubconta += a.getValorRealizado();
            }
            return valorRealizadoSubconta + valorRealizado;
        }
    }
    
    /**
     * Método para modificar o valor realizado
     * 
     *@param valorRealizado float valorRealizado - valor que será adicionado ao valor realizado
     */
    public void setValorRealizado(float valorRealizado){
        this.valorRealizado += valorRealizado;
    }
    
    /**
     * Método para retorno do valor comprometido
     * 
     * @return float - Valor comprometido
     */
    public float getValorComprometido() {
        float valorComprometidoSubconta = 0;
        if(subcontaOrcamento==null){
            return valorComprometido;
        }
        else{
            for(ContaOrcamento a : subcontaOrcamento){
                valorComprometidoSubconta += a.getValorComprometido();
            }
            return valorComprometidoSubconta + valorComprometido;
        }
    }
    
    /**
     * Método para retorno e cálculo do valor disponivel 
     * 
     * @return float - Valor disponível
     */
    public float getValorDisponivel(){
        valorDisponivel = this.getValorOrcado() - (this.getValorComprometido() + this.getValorRealizado());
        return valorDisponivel;
    }
    
    /**
     * Método para retorno das subcontas presentes na em uma conta de orçamento
     * 
     * @return ArrayList - Lista de subcontas de orçamento
     */
    public ArrayList<ContaOrcamento> getSubcontaOrcamento() {
        return subcontaOrcamento;
    }
}
