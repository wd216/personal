<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/ext.css"/>
</head>
<body>
<div class="container">
    <div class="row box" style="margin-bottom: 2rem; margin-top: 2rem;">
        <div class="col-md-10 column">
            <h1 style="color: red; margin: auto;">${orderitem[0].customer.name}的购物车</h1>
        </div>
        <div class="col-md-2 column" align="right">
            <a href="/index/0">返回首页</a>
        </div>
    </div>
    <div class="row well well-sm">
        <div class="col-md-2 column" align="left">
            <input type="checkbox"/>&nbsp;全选
        </div>
        <div class="col-md-3 column" align="left">商品信息</div>
        <div class="col-md-2 column" align="left">单价</div>
        <div class="col-md-2 column" align="left">数量</div>
        <div class="col-md-2 column" align="left">金额</div>
        <div class="col-md-1 column" align="left">操作</div>
    </div>
    <!-- 购物车列表 -->
    <c:forEach items="${orderitem}" var="order">
        <div class="row well well-sm box">
            <div class="col-md-2 column" align="left">
                <input type="checkbox"/>
                <img alt="120x120" width="120rem" height="120rem" src="/img/${order.book.image}" />
            </div>

            <div class="col-md-3 column" align="left">
                <p>${order.book.bname}</p>
            </div>
            <div class="col-md-2 column" align="left">
                <p class="price" style="font-size: large;">¥${order.book.price}</p>
            </div>
            <div class="col-md-2 column" align="left">
                <p class="buyCount">${order.num}</p>
            </div>
            <div class="col-md-2 column" align="left">
                <p class="totalPrice" style="color: red; font-size: large;">¥ ${order.num * order.book.price}</p>
            </div>
            <div class="col-md-1 column" align="left">
                <input style="background-color: blue;color: white" type="button" class="btn btn-danger" value="结算"/>

                <input type="button" class="btn btn-danger" name="del" value="删除"/>
            </div>
        </div>
    </c:forEach>
</div>

</body>
<script src="/js/operation.js"></script>
<script>

</script>
</html>
