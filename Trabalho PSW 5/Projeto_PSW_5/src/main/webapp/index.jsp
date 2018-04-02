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
            Nome      : <input type="text" name="nome" value="${param.nome}">${msgErroNome}<br>
            Nota 1    :<input type="text" name ="P1" value="${param.P1}">${msgErroNota}<br>
            Projeto   : <input type="text" name ="ProjAula" value="${param.ProjAula}">${msgErroNota2}<br>
            Trabalho  : <input type="text" name ="Trabalho" value="${param.Trabalho}">${msgErroNota3}<br>
            Frequencia: <input type="text" name ="freq" value ="${param.freq}">${msgErroFrequencia}<br>
            Nota PF   : <input type="text" name ="PF" value="${param.PF}">${msgErroNota4}<br>
            <button type="submit">Enviar</button>
            
        </form>
    </body>
</html>

