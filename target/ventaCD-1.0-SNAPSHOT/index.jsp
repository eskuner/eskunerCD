<%-- 
    Document   : index
    Created on : 11-28-2019, 09:43:50 AM
    Author     : anthony.lemususam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Resources/css/materialize.css"/>
        <link rel="stylesheet" href="Resources/css/Style.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body class="imagen">
        <div class="container">
            <div id="login-page" class="row">
                <div class="col s12 z-depth-6 card-panel">
                    <form class="login-form">
                        <div class="row">
                            <div class="progress  purple">
                                <div class="indeterminate"></div>
                            </div>

                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">headset_mic</i>
                                <input class="validate" id="email" type="email">
                                <label for="email" data-error="wrong" data-success="right">Usuario</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">audiotrack</i>
                                <input id="password" type="password">
                                <label for="password">Contraseña</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <a href="ArtistaServlet?select=menuadmi" class="btn waves-effect waves-purple  grey darken-3  col s12"><p class="tex">Login</p></a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div> 

        <script src="Resources/js/jquery-1.4.2.min.js" type="text/javascript"></script>
        <script src="Resources/js/materialize.js" type="text/javascript"></script>
        <script type="text/javascript">

        </script>
    </body>
</html>
