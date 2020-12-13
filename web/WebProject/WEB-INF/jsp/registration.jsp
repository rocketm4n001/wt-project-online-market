
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>

    <style><%@include file="/css/header.css"%></style>
    <style><%@include file="/css/login.css"%></style>

</head>
<body>

<%@  include file="/templates/header.jsp" %>

<%@  include file="/templates/top_nav.jsp" %>

<form class="buy_window" method="post" action="registration">
    <h2>Добро пожаловать!</h2>
    <h2>Регистрация:</h2>

    <p class="enter_email">Введите логин:</p>
    <input type="text" size="30" class="input_field" name="login">

    <p class="enter_email">Введите почту:</p>
    <input type="text" size="30" class="input_field" name="email">

    <p class="enter_email">Введите пароль:</p>
    <input type="text" size="30" class="input_field" name="password">

    <p class="enter_email">Введите пароль повторно:</p>
    <input type="text" size="30" class="input_field" name="password_repeat">

    <p class="enter_email">${message}</p>

    <button class="button">Зарегистрироваться</button>

</form>

<%@  include file="/templates/footer.jsp" %>

</body>
</html>