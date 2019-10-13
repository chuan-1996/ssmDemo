
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>SSM框架</title>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css" />
    <script src="${pageContext.request.contextPath}/js/jquery/jquery-2.2.4.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/operat.js" ></script>
</head>
<body>
<%@include file="head.jsp"%>
<%@include file="foot.jsp"%>
    <table id = "tab">
        <div style="color: #DB212E" id = "error"> &nbsp</div>
        <tr>
            <th colspan="4">标题</th>
        </tr>
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>真名</th>
            <th>角色</th>
        </tr>
    </table>

</body>
</html>
