package pirlimpimposo;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pirlimpimposo
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet{
    /**
     * Recebe os dados mandados pelo form e os calcula para decidir a situação do aluno, além de determinar validez dos dados
     * 
     */
    
    String sit;
    ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String nome = (String) req.getParameter("nome");
        double P1 = Double.parseDouble((String) req.getParameter("P1"));
        double ProjAula = Double.parseDouble((String) req.getParameter("projAula"));
        double Trabalho = Double.parseDouble((String) req.getParameter("Trabalho"));
        double freq = Double.parseDouble((String) req.getParameter("freq"));
        double PF = Double.parseDouble((String) req.getParameter("PF"));
        String Disciplina = (String) req.getParameter("disciplina");

        double media1 = 0.7 * ((P1 + Trabalho) / 2.0) + ProjAula * 0.3;
        boolean pf = false;
        boolean formValido = true;
        
        //efetua a validação
        if(nome == null || nome.equals("")){
            req.setAttribute("msgErroNome", "O nome deve ser preenchido");
            formValido = false;
        }
        
        if(P1>10.0 || P1 < 0){
            req.setAttribute("msgErroNota", "A nota deve ser <= 10 e > 0");
            formValido = false;
        }
        
        if(ProjAula>10.0 || ProjAula < 0){
            req.setAttribute("msgErroNota2", "A nota deve ser <= 10 e > 0");
            formValido = false;
        }

        if(Trabalho>10.0 || Trabalho < 0){
            req.setAttribute("msgErroNota3", "A nota deve ser <= 10 e > 0");
            formValido = false;
        }

        if(freq>100.0 || freq < 0){
            req.setAttribute("msgErroFrequencia", "A frequencia deve ser <= 100 e > 0");
            formValido = false;
        }

        if(PF>10.0 || PF < 0){
            req.setAttribute("msgErroNota4", "A nota deve ser <= 10 e > 0");
            formValido = false;
        }

        if(formValido){
            if (freq >= 75) {
                if (media1 >= 7.5) {
                    sit = "Aprovado";
                } else if (media1 < 3.0) {
                    sit = "Reprovado";
                } else {
                    pf = true;
                }

                if (pf == true) {
                    if (((PF + media1) / 2.0) >= 5.0) {
                        sit = "Aprovado";
                    } else {
                        sit = "Reprovado";
                    }
                }
            } else {

                sit = "Reprovado";
            }
            Aluno a = new Aluno(nome, P1, ProjAula, Trabalho, freq, PF, sit,Disciplina);
            listaAluno.add(a);
            req.getServletContext().setAttribute("Aluno", listaAluno);
            req.getRequestDispatcher("tabela.jsp").forward(req, resp);
        }
        else{
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
        

    }   
}

    