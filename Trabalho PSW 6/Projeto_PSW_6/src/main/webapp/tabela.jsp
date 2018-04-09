<%-- 
    Document   : tabela
    Created on : Mar 25, 2018, 7:33:29 PM
    Author     : Pirlimpimposo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import ="java.util.*"%>
<%@page import ="javax.servlet.*"%>
<%@page import ="pirlimpimposo.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
            table{border-collapse: collapse;}
            table,td,th{border:1px solid black;padding:0px;font-family:verdana;font-size:14px;}
        </style>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
        </table>
            <table class="table">
              <thead class="thead-dark">
                <tr>
                    <th scope="col">Nome</th>
                    <th scope="col">Prova1</th>
                    <th scope="col">ProjAula</th>
                    <th scope="col">Trabalho</th>
                    <th scope="col">Frequencia</th>
                    <th scope="col">ProvaFinal</th>
                    <th scope="col">Situação</th>
                    <th scope="col">Disciplina</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach items="${Aluno}" var="a">
                    <tr>
                        <td>${a.nome}</td>
                        <td>${a.p1}</td>
                        <td>${a.projAula}</td>
                        <td>${a.trabalho}</td>
                        <td>${a.freq}</td>
                        <td>${a.PF}</td>
                        <td>${a.situacao}</td>
                        <td>${a.disciplina}</td>
                    </tr>
                </c:forEach>
              </tbody>
            </table>
        <script src="js/jquery-3.2.1.slim.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
