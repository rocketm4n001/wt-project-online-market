
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <style><%@include file="/css/header.css"%></style>
    <style><%@include file="/css/cart.css"%></style>
    <!--шрифты-->
    <link href="https://fonts.googleapis.com/css?
	family=Kaushan+Script|Montserrat:
	400,700&display=swap" rel="stylesheet">

</head>
<body>

<%@  include file="/templates/header.jsp" %>

<%@  include file="/templates/top_nav.jsp" %>

<h1 class="cart_word">Корзина:</h1>

<div class="global_container">
    <div class="products" >

        <c:forEach  var="product" items="${Products}">
        <form class="product" method="post" action="cart.php" >
            <div class="img_product">
                <a href="#">
                    <img src="${pageContext.request.contextPath}${product.img}"/>
                </a>
            </div>
            <div class="text_product">
                <h2>${product.name}</h2>
                <p>Цвет: ${product.color}</p>
                <p>Размер: ${product.size}</p>
                <p class ="price">
                    Цена: ${product.price} <span>руб</span>
                </p>
            </div>
            <input type="hidden" name="delete" value="{{i.id_product}}"/>
            <button class="button_delete" id="{{i.id_product}}"> <img src="images/delete.png"/> </button>
        </form>
        </c:forEach>

        <c:if test="${isEmpty == true}">
            <p class="empty">Корзина пуста.</p>
        </c:if>

    </div>

    <form class="buy_window" method="post" action="cart.php">
        <h2>Корзина:</h2>
        <h2>Итог: ${total_price} руб</h2>
        <h2> ${total_amount} товара</h2>
        <p class="enter_email">Введите имя:</p>
        <input type="text" size="30" class="input_field" name="name">
        <p class="enter_email">Введите почту:</p>
        <input type="text" size="30" class="input_field" name="email">


        <button class="button">Оформить заказ</button>


    </form>

</div>

<%@  include file="/templates/footer.jsp" %>

</body>
