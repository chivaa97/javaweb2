<%-- 
    Document   : index
    Created on : 1 nov 2022, 19:42:14
    Author     : chiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>


        <nav class="navbar navbar-expand-lg bg-primary bg-primary">

            <div class="dropdown">
                <button style="border: none" class="btn btn btn-outline-light dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    ${usuario.getNombre()}
                    ${usuario.getApellidos()}

                </button>
                <ul class="dropdown-menu text-center">
                    <li><a class="dropdown-item" href="#">${usuario.getUsuario()}</a></li>
                    <div class="dropdown-divider"></div>
                    <form action="Validar" method="POST">
                        <button name="accion" value="salir" class="dropdown-item" href="#">Salir</button>
                    </form>
                </ul>
            </div>


            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav md-auto"> 
                    
                    <li class="nav-item">
                        <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Producto&accion=Listar" target="myframe">Producto</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=RegistrarVenta" target="myframe">Nueva Venta</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border:none" class="btn btn-outline-light" href="Controlador?menu=ConsultarVenta&accion=default" target="myframe">Consultar Ventas</a>
                    </li>
                </ul>
            </div>
        </nav>
                    
                    <div class="m-4" style="height: 500px; background-color: #cccccc">
                        <frameset>
                        <iframe name="myframe" style="height: 100%;  width:100%"></iframe>
                        </frameset>
                    </div>


        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
    </body>
</html>

