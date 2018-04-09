<%-- 
    Document   : index
    Created on : Mar 25, 2018, 5:59:25 PM
    Author     : Pirlimpimposo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="selects" uri="WEB-INF/selects.tld"%>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="RequestServlet" method ="POST">

          <div class="form-group">
                <input type="text" class="form-control-sm col-sm-4" id="validationDefault01" name="nome" placeholder="Nome" value="${param.nome}" required>
          </div>
          <div class="form-group">
                <input type="text" class="form-control-sm col-sm-4" id="validationDefault01" name ="P1" placeholder="Nota P1" value="${param.P1}" required>${msgErroNota}<br>
          </div>
          <div class="form-group">
                <input type="text" class="form-control-sm col-sm-4" id="validationDefault01" name ="projAula" placeholder="Nota Projeto" value="${param.projAula}" required>${msgErroNota2}<br>
          </div>
          <div class="form-group">
                <input type="text" class="form-control-sm col-sm-4" id="validationDefault01" name ="Trabalho" placeholder="Nota Trabalho" value="${param.Trabalho}" required>${msgErroNota3}<br>
          </div>          
          <div class="form-group">
                <input type="text" class="form-control-sm col-sm-4" id="validationDefault01" name ="freq" placeholder="Frequência" value="${param.freq}" required>${msgErroFrequencia}<br>
          </div>          
          <div class="form-group">
                <input type="text" class="form-control-sm col-sm-4" id="validationDefault01" name ="PF" placeholder="Nota Prova Final" value="${param.PF}" required>${msgErroNota4}<br>
          </div>
          <selects:SelectPerfilTag disciplinaSelecionada="${param.disciplina}"/><br> 
          <button class="btn btn-primary" type="submit">Enviar</button>
        </form>
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="js/jquery-3.2.1.slim.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>

