/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto_psw_1;
import java.util.Scanner;
/**
 * 
 * @author Pirlimpimposo
 */
public class Aluno {

    public String Situacao(double p1, double Trabalho, double Projetos, double frequencia, double pf){
        String situacao;
        double m1 = (0.7*((p1+Trabalho)/2)) + (Projetos*0.3);
        if(frequencia > 75){
            if(m1>=7)
                situacao = "Aprovado";
            else if(m1 < 3)
                situacao = "Reprovado";
            else{
                Scanner scan2 = new Scanner(System.in);
                situacao = "Prova Final";
                if((pf + m1)/2 >= 5)
                    situacao = "Aprovado";
                else
                    situacao = "Reprovado";
            }
        }
        else{
            situacao = "Reprovado";
        }
        return situacao;
    }
}
