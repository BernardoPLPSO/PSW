/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private double P1;
    private double ProjAula;
    private double Trabalho;
    private double freq;
    private double PF;
    private String Situacao;

    public Aluno(String nome, double P1, double ProjAula, double Trabalho, double freq, double PF, String Situacao) {
        this.nome = nome;
        this.P1 = P1;
        this.ProjAula = ProjAula;
        this.Trabalho = Trabalho;
        this.freq = freq;
        this.PF = PF;
        this.Situacao = Situacao;
    }
   
    
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getProjAula() {
        return ProjAula;
    }

    public void setProjAula(double ProjAula) {
        this.ProjAula = ProjAula;
    }

    public double getTrabalho() {
        return Trabalho;
    }

    public void setTrabalho(double Trabalho) {
        this.Trabalho = Trabalho;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
    
}
