/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto_psw_1;

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
public class AlunoTest {
    
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Teste da situacao do aluno quando reprovado por presenca (frequencia < 75%)
     */
    @Test
    public void testSituacaoReprovadoPresenca() {
        System.out.println("Situacao reprovado por presenca");
        double p1 = 10.0;
        double Trabalho = 10.0;
        double Projetos = 10.0;
        double frequencia = 74.0;
        double pf = 10.0;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.Situacao(p1, Trabalho, Projetos, frequencia,pf);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste da situacao do aluno quando reprovado direto (media1 < 3)
     */
    @Test
    public void testSituacaoReprovadoDireto() {
        System.out.println("Situacao reprovado direto");
        double p1 = 2.9;
        double Trabalho = 2.9;
        double Projetos = 2.9;
        double frequencia = 76.0;
        double pf = 10.0;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.Situacao(p1, Trabalho, Projetos, frequencia,pf);
        assertEquals(expResult, result);
    } 
    
    /**
     *Teste da situacao do aluno quando reprovado apos fazer PF ((media + nota PF)/2 < 5)
    */
    @Test
    public void testSituacaoReprovadoAposPF() {
        System.out.println("Situacao reprovado apos PF");
        double p1 = 3.0;
        double Trabalho = 3.0;
        double Projetos = 3.1;
        double frequencia = 76.0;
        double pf = 0;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.Situacao(p1, Trabalho, Projetos, frequencia,pf);
        System.out.println((0.7*((p1+Trabalho)/2)) + (Projetos*0.3));
        assertEquals(expResult, result);
    }
    /**
     *Teste da situacao do aluno quando aprovado direto
     */
    @Test
    public void testSituacaoAprovadoDireto(){
        System.out.println("Situacao aprovado direto");
        double p1= 7.0;
        double Trabalho = 7.0;
        double Projetos = 7.0;
        double frequencia = 76.0;
        double pf = 0.0;
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.Situacao(p1, Trabalho, Projetos, frequencia,pf);
        assertEquals(expResult, result);
    }
    
    /**
     *Teste da situacao do aluno quando aprovado apos fazer PF
    */
    @Test
    public void testSituacaoAprovadoAposPF() {
        System.out.println("Situacao aprovado apos PF" );
        double p1 = 5.0;
        double Trabalho = 5.0;
        double Projetos = 5.0;
        double frequencia = 76.0;
        double pf = 5.0;
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.Situacao(p1, Trabalho, Projetos, frequencia,pf);
        assertEquals(expResult, result);
    }
}
