<%-- 
    Document   : tabela
    Created on : May 6, 2018, 3:44:24 AM
    Author     : Pirlimpimposo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import ="java.util.*"%>
<%@page import ="javax.servlet.*"%>
<%@ taglib prefix="selects" uri="WEB-INF/selects.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        table {
        	border-collapse: collapse;
		}
		table, td, th {
    		border: 1px solid black;
            padding: 0px;
            font-family:verdana;
            font-size:14px;
		}
        </style>
    </head>
    <body>
        <table>
            <th>${orcamento.nome}</th>
            <th>Orçado</th>
            <th>Realizado</th>
            <th>Comprometido</th>
            <th>Disponivel</th>
            <c:forEach items="${contaOrcamento}" var="c">
                <c:set var="totalOrcado" value="${c.valorOrcado + totalOrcado}"/>
                <c:set var="totalRealizado" value="${c.valorRealizado + totalRealizado}"/> 
                <c:set var="totalComprometido" value="${c.valorComprometido + totalComprometido}"/> 
                <c:set var="totalDisponivel" value="${c.valorDisponivel + totalDisponivel}"/> 
                <selects:PrintDadosOrcamentoTag orcamento="${c}"/>
            </c:forEach>
            <tr>
                <td><b>Totais</b></td>
                <td>${totalOrcado}</td>
                <td>${totalRealizado}</td>
                <td>${totalComprometido}</td>
                <td>${totalDisponivel}</td>
            </tr>
        </table>
        <form action="ValorRealizadoServlet" method ="POST">
            Código Orçamento: <input type="text" name="codigo" <br>
            Valor Realizado: <input type="text" name="realizado" <br>
            <button type="submit">Enviar</button>
        </form>
        ${msgErro}
    </body>
</html>
