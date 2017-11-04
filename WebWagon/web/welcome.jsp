<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Вход в систему</title>
    </head>
    <body>
        <h1>Авторизация!</h1>
        <form action="auth" method="POST">
            <h4>Логин:</h4>
            <input type="text" name="login"/>
            <h4>Пароль:</h4>
            <input type="password" name="password"/>
            <input type="submit" value="OK"/>
        </form>
    </body>
</html>
