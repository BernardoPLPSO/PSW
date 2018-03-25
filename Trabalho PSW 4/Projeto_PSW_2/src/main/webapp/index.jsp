<%-- 
    Document   : index
    Created on : Mar 25, 2018, 5:59:25 PM
    Author     : Pirlimpimposo
--%>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="RequestServlet" method ="POST">
            Nome: <input type="text" name="nome" value="<%= request.getParameter("nome") != null ? request.getParameter("nome") : "" %>"><%= request.getAttribute("msgErroNome") != null ? request.getAttribute("msgErroNome") : "" %><br>
            Nota 1:<input type="text" name ="P1" value="<%= request.getParameter("P1") != null ? request.getParameter("P1") : "" %>"><%= request.getAttribute("msgErroNota") != null ? request.getAttribute("msgErroNota") : "" %><br>
            Projeto: <input type="text" name ="ProjAula" value="<%= request.getParameter("ProjAula") != null ? request.getParameter("ProjAula") : "" %>"><%= request.getAttribute("msgErroNota") != null ? request.getAttribute("msgErroNota") : "" %><br>
            Trabalho: <input type="text" name ="Trabalho" value="<%= request.getParameter("Trabalho") != null ? request.getParameter("Trabalho") : "" %>"><%= request.getAttribute("msgErroNota") != null ? request.getAttribute("msgErroNota") : "" %><br>
            Frequencia: <input type="text" name ="freq" value ="<%= request.getParameter("freq") != null ? request.getParameter("freq") : "" %>"><%= request.getAttribute("msgErroFrequencia") != null ? request.getAttribute("msgErroFrequencia") : "" %><br>
            Nota PF: <input type="text" name ="PF" value="<%= request.getParameter("PF") != null ? request.getParameter("PF") : "" %>"><%= request.getAttribute("msgErroNota") != null ? request.getAttribute("msgErroNota") : "" %><br>
            <button type="submit">enviar</button>
            
        </form>
    </body>
</html>

