<%-- 
    Document   : artista
    Created on : 11-28-2019, 02:39:05 PM
    Author     : anthony.lemususam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</head>
<body>
    <div class="row ">
        <div class="barra">
            <div class="row">
                <div class="col s12">
                    <p class="o"> Mi Lista de Artista </p>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col s2 navv">
            <div class="row">
                <div class="col s3"></div>
                <div class="col s6">
                    <img class="circle responsive-img" src="Resources/img/prueba1.jpg">
                </div>
                <div class="col s3"></div>
            </div>
            <div class="row r">
                <div class="col s12 teal accent-3">

                    <p class="center tm1">ARTISTAS <p>
                </div> 
            </div>
            <div class="row r">
                <div class="col s12">
                    <p class="center tm">Nuevo artista <p>
                </div> 
            </div>
            <div class="row r">
                <div class="col s12 ">
                    <p class="center tm">Canciones del artista <p>
                </div> 
            </div>
            <div class="row">
                <div class="col s12 barram"></div>
            </div>
            <div class="row r">
                <div class="col s12">
                    <p class="center tm">Inicio<p>
                </div> 
            </div>
            <div class="row r">
                <div class="col s12 ">
                    <p class="center tm">Banda<p>
                </div> 
            </div>
            <div class="row r">
                <div class="col s12 ">
                    <p class="center tm">Grupo<p>
                </div> 
            </div>
            <div class="row">
                <div class="col s12 barram1"></div>
            </div>
            <div class="row r">
                <div class="col s12">
                    <p class="center tm">Coleccion de disco<p>
                </div> 
            </div>
            <div class="row r">
                <div class="col s12 ">
                    <p class="center tm">Compra de discos<p>
                </div> 
            </div>
            <div class="row r">
                <div class="col s12 ">
                    <p class="center tm">Venta de discos<p>
                </div> 
            </div>
        </div>

        <div class="col s10 naav">
            <div class="row  m">
                <div class="row">
                    <div class="col s12">
                        <table class="responsive-table highlight centered ">
                            <thead>
                                <tr class="t">
                                    <th> <div class="preloader-wrapper small active">
                                            <div class="spinner-layer spinner-purple-only">
                                                <div class="circle-clipper left">
                                                    <div class="circle"></div>
                                                </div><div class="gap-patch">
                                                    <div class="circle"></div>
                                                </div><div class="circle-clipper right">
                                                    <div class="circle"></div>
                                                </div>
                                            </div>
                                        </div></th>
                                    <th>N°</th>
                                    <th>Nombre</th>
                                    <th>Nacionalidad</th>
                                    <th>Idioma</th>
                                </tr>
                            </thead> 
                            <tbody>
                                <c:forEach items="${a}" var="ad">
                                    <tr>
                                        <td><div class="preloader-wrapper small active">
                                            <div class="spinner-layer spinner-yellow-only">
                                                <div class="circle-clipper left">
                                                    <div class="circle"></div>
                                                </div><div class="gap-patch">
                                                    <div class="circle"></div>
                                                </div><div class="circle-clipper right">
                                                    <div class="circle"></div>
                                                </div>
                                            </div></td>
                                        <td>${ad.id_artista}</td>
                                        <td>${ad.nombre_real}</td>
                                        <td>${ad.nacionalidad}</td>
                                        <td>${ad.idioma}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <script src="Resources/js/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script src="Resources/js/materialize.js" type="text/javascript"></script>
    <script type="text/javascript">

    </script>
</body>
</html>
