
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <style><%@include file="/css/header.css"%></style>
    <style><%@include file="/css/choose.css"%></style>

</head>
<body>

<%@  include file="/templates/header.jsp" %>
<%@  include file="/templates/top_nav.jsp" %>

<div class="global_container">
<div class="container">
    <div class="navigation">
        <nav class="nav2">
            <ul id ="ul">
                <c:forEach  var="elem" items="${navigation}">
                    <li><a href="#" class="nav_link">${elem}</a></li>
                </c:forEach>
            </ul>
        </nav>
    </div>

    <div class="product_place">
        <div class="image_part">
            <img src="${pageContext.request.contextPath}${product.img}"/>
        </div>
        <form class="txt_part" method="post" action="choose.php?id=${product.id}">
            <h1></h1>
            <h2> ${product.name} </h2>
            <p>Стоимость: ${product.price} <span>руб</span> </p>
            <p>Цвет: ${product.color}</p>
            <p>Размер:  ${product.size} </p>
            <input type="hidden" name="button_pressed" value="${product.id}"/>
            <button class="button"> Добавить в корзину </button>

            <c:if test="${isAlreadyInCart == true}">
                <p>Уже находится в корзине.</p>
            </c:if>

            <c:if test="${isSuccess == true}">
                <p>Успешно добавлен в корзину.</p>
            </c:if>
        </form>
        <div class="product_description">
            <p><span>Description: </span></br>
            </p>
        </div>
    </div>
</div>
</div>

<%@  include file="/templates/footer.jsp" %>

</body>
</html>
