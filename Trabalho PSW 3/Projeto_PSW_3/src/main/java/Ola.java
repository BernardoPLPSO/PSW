/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *f
 * @author Aluno
 */
@WebServlet(urlPatterns = {"/Ola"})
public class Ola extends HttpServlet {
    
    public Ola(){
        System.out.println("Construtor");
    }
    
    
    @Override
    public void init() throws ServletException {
        System.out.println("init");
        
       
    }
    
    @Override
    public void destroy(){
        System.out.println("destroy");
    }
    


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Recebeu Post");
    }

    
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pr = resp.getWriter();
        pr.print("<h1>doGet</h1>");
        System.out.println("recebeu Get");
    }
        
    
}
