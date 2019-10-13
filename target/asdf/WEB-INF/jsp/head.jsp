<%@ page import="com.chuan.service.vo.UserVO" %>
<%@ page import="com.chuan.commons.SessionConst" %>
<%--
  Created by IntelliJ IDEA.
  User: qq491
  Date: 2019/9/4
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title></title>
    <script src="${pageContext.request.contextPath}/js/jquery/jquery-2.2.4.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/isAdmin.js" ></script>
</head>
<div id="header">
    <div >
        <%
            UserVO user = (UserVO)request.getSession().getAttribute(SessionConst.IN);
            String name = user.getUsername();
        %>
        <div >
            <img alt="" src="resources/imgs/login.png" width="40px" height="40px" style="vertical-align:middle"/>
            <span >SSM框架练习</span>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href = "${pageContext.request.contextPath}/index">主页</a>
            <a href = "${pageContext.request.contextPath}/update" id = "user-name"><%=name%></a>
            <a href = "${pageContext.request.contextPath}/management" id = "management">用户管理</a>
            <a href = "${pageContext.request.contextPath}/logout">退出</a>

        </div>
    </div>

</div>
