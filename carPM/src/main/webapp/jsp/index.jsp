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
            <form role="form" class="form-inline" action="/name" method="get">
                <div class="form-group">
                    <input type="text" size="60" class="form-control" name="search" placeholder="只根据书名查询，如果找不到将显示所有图书"/>
                    <input type="submit" class="btn btn-primary" value="搜索"/>
                </div>
            </form>
        </div>
        <div class="col-md-2 column" align="right">
            <a id="carthref" onclick="order()" href="/orderItem/${newcustomer.id}"><span class="badge pull-right"></span>我的购物车</a>
        </div>

        <c:choose>
            <c:when test="${newcustomer == null}">
                <div class="col-md-1 column" align="right">
                    <a href="#" id="loginhref" onclick="login()">登陆</a>
                    <a href="#" id="reghref" onclick="zhuche()">注册</a>
                </div>
            </c:when>
            <c:otherwise>
                <div class="col-md-1 column" align="right">
                    <p>${newcustomer.name}：欢迎您</p>
                    <a href="/Login/return" onclick="zhuxiao()">注销</a>
                </div>
            </c:otherwise>
        </c:choose>
    </div>
    <!-- 商品列表 -->
    <div class="row">
        <div class="col-md-2 column">
            <ul class="nav navcolor nav-pills nav-stacked">
                <li class="active">
                    <a href="/index/0">分类</a>
                </li>
                <c:forEach items="${data.btypes}" var="type">
                    <li class="nav">
                        <a href="/index/${type.id}">${type.type}</a>
                    </li>
                </c:forEach>
            </ul>
        </div>

        <div class="col-md-10 column">
            <div class="row">
                <c:forEach var="book" items="${data.books}">
                    <div class="col-md-4">
                        <div class="thumbnail">
                            <img alt="300x300"
                                 src="/img/${book.image}">
                            <div class="caption">
                                <h3 style="color: red; font-weight: bold;">¥${book.price}</h3>
                                <p>${book.bname}</p>
                                <p>
                                    <a class="btn btn-primary addcart" onclick="addorder(this)">加入购物车</a>
                                </p>
                                <p name="uid" value="${newcustomer.id}" />
                                <p name="bid" value="${book.id}" />
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
    // 退出的方法
    function zhuxiao(){
        fetch('http://localhost:8080/Login/return')
            .then(data => {
                window.location.reload();
            });
    }
    // 进入购物车的方法
    function order(){
        if (${newcustomer == null}){
            alert("请先登录");
            $('#carthref').attr("href","/orderItem/0");
        }else{
            $('#carthref').attr("href","/orderItem/${newcustomer.id}")
        }
    }
    //添加物品到购物车的方法
    function addorder(event){
        const parent = event.parentNode;
        // TODO 获取 当前节点 的父节点的下一个兄弟节点的值 19/1/16 20:33
        console.log(parent.next().value);
        // const bid = event.getElementsByName("bid");
        // console.log(uid + ":" + bid);
        // $.ajax({
        //     type: "POST",
        //     url: "/orderItem/add",
        //     data: {
        //         customer:uid[0].val(),
        //         book:bid[0].val()
        //     }
        // }).done(function (data) {
        //     console.log("ok");
        // });
    }


</script>

</html>