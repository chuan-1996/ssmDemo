
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>SSM框架</title>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css" />
</head>
<body>
    <%@include file="head.jsp"%>
    <%@include file="foot.jsp"%>
<div >

    <div >
    <h2>Hello!</h2>
    <%
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today = df.format(date);

    %>
    <h1><%=today%></h1>
    </div>

</div>
</body>
</html>
