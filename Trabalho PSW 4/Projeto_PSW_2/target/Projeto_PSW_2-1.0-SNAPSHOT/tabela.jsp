<%-- 
    Document   : tabela
    Created on : Mar 25, 2018, 7:33:29 PM
    Author     : Pirlimpimposo
--%>

<%@page import ="java.util.*"%>
<%@page import ="javax.servlet.*"%>
<%@page import ="br.pirlimpimposo.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
            table{border-collapse: collapse;}
            table,td,th{border:1px solid black;padding:0px;font-family:verdana;font-size:14px;}
        </style>
    </head>
    <body>
        <table>
            <th>Nome</th>
            <th>Prova1</th>
            <th>ProjAula</th>
            <th>Trabalho</th>
            <th>Frequencia</th>
            <th>ProvaFinal</th>
            <th>Situação</th>
            <%
                List<Aluno> a = (ArrayList<Aluno>) request.getServletContext().getAttribute("Aluno");
                for(Aluno b:a){
            %>
            <tr>
                <td><%=b.getNome()%></td>
                <td><%=b.getP1()%></td>
                <td><%=b.getProjAula()%></td>
                <td><%=b.getTrabalho()%></td>
                <td><%=b.getFreq()%></td>
                <td><%=b.getPF()%></td>
                <td><%=b.getSituacao()%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
