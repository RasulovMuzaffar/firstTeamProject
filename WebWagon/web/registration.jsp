<%-- 
    Document   : registration
    Created on : 04.11.2017, 18:34:09
    Author     : Muzaffar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Add new user</h1>
        
        <form action="reg" method="POST">
            <h4>Фамилия:</h4>
            <input type="text" name="lName"/>
            <h4>Имя:</h4>
            <input type="text" name="fName"/>
            <h4>Логин:</h4>
            <input type="text" name="login"/>
            <h4>Пароль:</h4>
            <input type="text" name="password"/>
            <h4>eMail:</h4>
            <input type="text" name="eMail"/>
            <h4>id Служба:</h4>
            <input type="text" name="idSljb"/>
            <h4>id Должность:</h4>
            <input type="text" name="idDolj"/>
            <h4>id Роль:</h4>
            <input type="text" name="idRole"/>
            <input type="submit" value="OK"/>
        </form>
    </body>
</html>
