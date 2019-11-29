
<%-- 
    Document   : nuevaNoticia
    Created on : 19/11/2019, 00:31:31
    Author     : blasc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>Create</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    Editando Empleado
                </div>
                <div class="card-body">
                    <form method="POST">
                        
                        <input name = "ID" type="hidden" value = "${datos[0].getId()}"/>
                        <label>Departamento</label>
                        <input type="text" name="nombre" class="form-control">
                        
                        <label>Apellido</label>
                        <input type="text" name="apellido" class="form-control">
                        
                        <label>Salario</label>
                        <input type="text" name="salario" class="form-control">
                        
                        <label>Edad</label>
                        <input type="text" name="edad" class="form-control">
                        
                        <label>Departamento</label>
                        <input type="text" name="idDepartamento" class="form-control">
                        
                        <input type="submit" value="Agregar" class="btn btn-success">
                        
                    </form>
                    
                </div>
            </div>
            
        </div>
    </body>
</html>