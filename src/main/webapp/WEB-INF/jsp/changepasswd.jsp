
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>SSM框架</title>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css" />
    <script src="${pageContext.request.contextPath}/js/jquery/jquery-2.2.4.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/updatePasswd.js" ></script>
</head>
<body>
    <%@include file="head.jsp"%>
    <%@include file="foot.jsp"%>


    <div class="login-form">

        <!-- form -->
        <form class="login-form1" method="POST">
            <div class="h252 pl20 pr20">
                <div class="w100p">
                    <div class="h40 center">
                        <div class="warning fs10 color-r" id="error">错误提示</div>
                    </div>

                </div>
                <div class="w100p">
                    <div class="h50 center">

                        <input placeholder="原密码" id="username" class="itxt" type="text" name="oldPassword"
                               autocomplete="off">
                    </div>
                </div>
                <div class="w100p">
                    <div class="h50 center pt10">

                        <input placeholder="新密码" id="realname" class="itxt" type="password" name="password1"
                               autocomplete="off">
                    </div>
                </div>
                <div class="w100p">
                    <div class="h50 center pt10">

                        <input placeholder="再次输入新密码" id="password" class="itxt" type="password" name="password2"
                               autocomplete="off">
                    </div>
                </div>

                <div class="w100p">
                    <div class="h50 center">
                        <button class="loginBtn" type="submit">修&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;改</button>
                        <!-- <div class="login-btn"><a href="javascript:asdf()">登&nbsp;&nbsp;&nbsp;&nbsp;录</a></div>-->
                    </div>
                </div>
            </div>

        </form>

    </div>


</body>
</html>
