<%-- 
    Document   : tabela
    Created on : Mar 25, 2018, 7:33:29 PM
    Author     : Pirlimpimposo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <c:forEach items="${Aluno}" var="a">
                <tr>
                    <td>${a.nome}</td>
                    <td>${a.p1}</td>
                    <td>${a.projAula}</td>
                    <td>${a.trabalho}</td>
                    <td>${a.freq}</td>
                    <td>${a.PF}</td>
                    <td>${a.situacao}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
