<%-- 
    Document   : form
    Created on : May 6, 2018, 3:36:14 AM
    Author     : Pirlimpimposo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import ="java.util.*"%>
<%@page import ="javax.servlet.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html><!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="RequestServlet" method ="POST">
            Nome da empresa:
            <select name="empresa">
                <option value="Empresa A">Empresa A</option>
                <option value="Empresa B">Empresa B</option>
            </select><br>
            Ano do orcamento:
            <select name="ano">
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
            </select>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>

