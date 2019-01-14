<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>南方书城</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/ext.css"/>
</head>
<style>
    img{
        width:200px;
        height: 200px;
        border: 1px solid red;
    }
</style>
<body>
<div class="container">
    <div class="row box" style="margin-top: 2rem; margin-bottom: 2rem;">
        <div class="col-md-3 column">
            <!-- 修改bootstrap中h1的margin-->
            <h1 style="color: red; margin: auto;">梦幻书网</h1>
        </div>
        <div class="col-md-6 column">
            <form role="form" class="form-inline">
                <div class="form-group">
                    <input type="text" size="60" class="form-control" id="search" placeholder="搜一下"/>
                    <input type="button" class="btn btn-primary" value="搜索"/>
                </div>
            </form>
        </div>
        <div class="col-md-2 column" align="right">
            <a id="carthref" href="jsp/cart.jsp"><span class="badge pull-right">2</span>我的购物车</a>
        </div>
        <div class="col-md-1 column" align="right">
            <a href="#" id="loginhref" onclick="login()">登陆</a>
            <a href="#" id="reghref" onclick="zhuche()">注册</a>
        </div>
    </div>
    <!-- 商品列表 -->
    <div class="row">
        <div class="col-md-2 column">
            <ul class="nav navcolor nav-pills nav-stacked">
                <li class="active">
                    <a href="#">分类</a>
                </li>
                <c:forEach items="${data.btypes}" var="type">
                    <li class="nav">
                        <a href="/shop_all">${type.type}</a>
                    </li>
                </c:forEach>
                <li class="nav">
                    <a href="#">SDV</a>
                </li>
                <li class="nav">
                    <a href="#">紧凑型</a>
                </li>
                <li class="nav">
                    <a href="#">中型</a>
                </li>
                <li class="nav">
                    <a href="#">大型</a>
                </li>
                <li class="nav">
                    <a href="#">轿跑</a>
                </li>
                <li class="nav">
                    <a href="#">超跑</a>
                </li>
                <li class="nav">
                    <a href="#">房车</a>
                </li>
            </ul>
        </div>

        <div class="col-md-10 column">
            <div class="row">
                <c:forEach var="book" items="${data.books}">
                    <div class="col-md-4">
                        <div class="thumbnail">
                            <img alt="300x300"
                                 src="img/${book.image}">
                            <div class="caption">
                                <h3 style="color: red; font-weight: bold;">¥${book.price}</h3>
                                <p>
                                        ${book.bname}
                                </p>
                                <p>
                                    <a class="btn btn-primary addcart" href="#">加入购物车</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
    <!-- 模态框 -->
    <div id="modal"></div>
</div>
</body>

<script src="/js/jquery-3.3.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/operation.js"></script>
<script>

    function login() {
        $("#modal").load("/jsp/login.jsp", function () {
            $('#loginModal').modal('show');
        });
    }

    function zhuche() {
        $("#modal").load("/jsp/reg.jsp", function () {
            $('#regModal').modal('show');
        });

    }
</script>


</html>