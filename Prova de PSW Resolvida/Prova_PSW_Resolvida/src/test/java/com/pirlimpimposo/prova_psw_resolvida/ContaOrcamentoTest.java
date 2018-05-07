/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirlimpimposo.prova_psw_resolvida;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pirlimpimposo
 */
public class ContaOrcamentoTest {
    /**
     * Test of getValorOrcado method, of class ContaOrcamento.
     */
    @org.junit.Test
    public void testGetValorOrcadoSemSubcontas() {
        System.out.println("Situação do valor orçado sem subcontas na conta de orçamento");
        float valorOrcado = 100;
        ContaOrcamento instance = new ContaOrcamento("A","1",valorOrcado,0,0);
        float expResult = 100;
        float result = instance.getValorOrcado();
        assertEquals(expResult, result,0);
    }
    
    /**
     * Test of getValorOrcado method, of class ContaOrcamento.
     */
    @org.junit.Test
    public void testGetValorOrcadoComSubcontas() {
        System.out.println("Situação do valor orçado com subcontas na conta de orçamento");
        float valorOrcado = 100;
        ContaOrcamento a = new ContaOrcamento("A","1",100,0,0);
        ContaOrcamento b = new ContaOrcamento("A","1",100,0,0);
        ArrayList<ContaOrcamento> subconta = new ArrayList();
        subconta.add(a);
        subconta.add(b);
        ContaOrcamento instance = new ContaOrcamento("A","1",valorOrcado,0,0,subconta);
        float expResult = 300;
        float result = instance.getValorOrcado();
        assertEquals(expResult, result,0);
    }
    
    /**
     * Test of getValorRealizado method, of class ContaOrcamento.
     */
    @org.junit.Test
    public void testGetValorRealizadoSemSubcontas() {
        System.out.println("Situação do valor realizado sem subcontas na conta de orçamento");
        float valorRealizado = 100;
        ContaOrcamento instance = new ContaOrcamento("A","1",0,valorRealizado,0);
        float expResult = 100;
        float result = instance.getValorRealizado();
        assertEquals(expResult, result,0);
    }
    
    /**
     * Test of getValorRealizado method, of class ContaOrcamento.
     */
    @org.junit.Test
    public void testGetValorRealizadoComSubcontas() {
        System.out.println("Situação do valor realizado com subcontas na conta de orçamento");
        float valorRealizado = 100;
        ContaOrcamento a = new ContaOrcamento("A","1",0,100,0);
        ContaOrcamento b = new ContaOrcamento("A","1",0,100,0);
        ArrayList<ContaOrcamento> subconta = new ArrayList();
        subconta.add(a);
        subconta.add(b);
        ContaOrcamento instance = new ContaOrcamento("A","1",0,valorRealizado,0,subconta);
        float expResult = 300;
        float result = instance.getValorRealizado();
        assertEquals(expResult, result,0);
    }
    
    /**
     * Test of getValorComprometido method, of class ContaOrcamento.
     */
    @org.junit.Test
    public void testGetValorComprometidoSemSubcontas() {
        System.out.println("Situação do valor comprometido sem subcontas na conta de orçamento");
        float valorComprometido = 100;
        ContaOrcamento instance = new ContaOrcamento("A","1",0,0,valorComprometido);
        float expResult = 100;
        float result = instance.getValorComprometido();
        assertEquals(expResult, result,0);
    }
    
    @org.junit.Test
    public void testGetValorComprometidoComSubcontas() {
        System.out.println("Situação do valor comprometido com subcontas na conta de orçamento");
        float valorComprometido = 100;
        ContaOrcamento a = new ContaOrcamento("A","1",0,0,100);
        ContaOrcamento b = new ContaOrcamento("A","1",0,0,100);
        ArrayList<ContaOrcamento> subconta = new ArrayList();
        subconta.add(a);
        subconta.add(b);        
        ContaOrcamento instance = new ContaOrcamento("A","1",0,0,valorComprometido,subconta);
        float expResult = 300;
        float result = instance.getValorComprometido();
        assertEquals(expResult, result,0);
    }
    /**
     * Test of getValorDisponivel method, of class ContaOrcamento.
     */
    @org.junit.Test
    public void testGetValorDisponivelSubcontas() {
        System.out.println("Teste da função de determinar o valor disponível da conta de orçamento");
        ContaOrcamento a = new ContaOrcamento("A","1",100,0,0);
        ContaOrcamento b = new ContaOrcamento("A","1",100,0,0);
        ArrayList<ContaOrcamento> subconta = new ArrayList();
        subconta.add(a);
        subconta.add(b);
        ContaOrcamento instance = new ContaOrcamento("A","1",100,100,0,subconta);
        float expResult = 200;
        float result = instance.getValorDisponivel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}