<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <style><%@include file="/css/header.css"%></style>
    <style><%@include file="/css/main_choose.css"%></style>

</head>
<body>

<%@  include file="/templates/header.jsp" %>
<%@  include file="/templates/top_nav.jsp" %>

<div class="global_container">
    <div class="container">
        <form class="nav_filters" method="GET" action="main.php">
            <div class="navigation">
                <nav class="nav2">
                    <ul id ="ul">
                        <c:forEach  var="elem" items="${navigation}">
                            <li>
                                <a href="#" class="nav_link">${elem}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </nav>
            </div>
            <div class="filters">
                <p>Цвет:</p>
                <div class="color_box">
                    <div class="container_color">
                        <div class="color_element">
                            <img src="${pageContext.request.contextPath}/images/colors/blue.jpg"/>
                            <input type="radio" name="color" value="blue" class="radio">
                        </div>
                        <div class="color_element">
                            <img src="${pageContext.request.contextPath}/images/colors/black.jpg"/>
                            <input type="radio" name="color" value="black" class="radio">
                        </div>
                    </div>
                </div>
                <p>Размер:</p>
                <div class="size_box">
                    <div class="container_size">
                        <div class="size_element">
                            <p>30 мм</p>
                            <input type="radio" name="size" value="30">
                        </div>
                        <div class="size_element">
                            <p>32 мм</p>
                            <input type="radio" name="size" value="32">
                        </div>
                        <div class="size_element">
                            <p>36 мм</p>
                            <input type="radio" name="size" value="36">
                        </div>
                        <div class="size_element">
                            <p>40 мм</p>
                            <input type="radio" name="size" value="40">
                        </div>
                        <div class="size_element">
                            <p>42 мм</p>
                            <input type="radio" name="size" value="42">
                        </div>
                    </div>
                </div>
            </div>
            <input type="hidden" name="gender" value="{{gender}}">
            <input type="hidden" name="category" value="{{category}}">
            <button class="button">Применить</button>
        </form>

        <div class="katalog">
            <c:if test="${isNothing == true}">
                <p class="error_message" >Товары не найдены.</p>
            </c:if>
            <div class="container1">
                <c:forEach  var="product" items="${Products}">
                <div class="product">
                    <div class="img_product">
                        <a href="/WebTech_war_exploded/about">
                            <img src="${pageContext.request.contextPath}${product.img}"/>
                        </a>
                    </div>
                    <h2>${product.name}</h2>
                    <p class ="price">
                        ${product.price} <span>руб</span>
                    </p>
                </div>
                </c:forEach>


            </div>

        </div>
    </div>
</div>

<%@  include file="/templates/footer.jsp" %>

</body>
</html>>