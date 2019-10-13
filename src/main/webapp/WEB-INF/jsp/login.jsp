<%--
  Created by IntelliJ IDEA.
  User: qq491
  Date: 2019/9/4
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="resources/css/login.css" />
    <script src="${pageContext.request.contextPath}/js/jquery/jquery-2.2.4.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js" ></script>
</head>



<body>
<div class="skin">
</div>

<div class="else">

    <div class="warning-wrap">
        <div class="warning">
            <p>依据《网络安全法》，为保障您的账户安全和正常使用，请尽快完成手机号验证！ 新版<a href="">《隐私政策》</a>已上线，将更有利于保护您的个人隐私。</p>
        </div>
    </div>

    <div class="login-wrap">
        <div class="w">
            <div class="content">
                <div class="login-form">
                    <!-- warning start -->
                    <div class="warning-wrap">
                        <div class="warning"> <p>我们不会以任何理由要求您转账汇款，谨防诈骗。</p> </div>
                    </div>
                    <!-- warning stop -->
                    <div class="login-box h50">
                        <div class="fl login-way"> 扫码登录 </div>
                        <div class="fr login-way color-r"> 账户登录 </div>
                    </div>

                    <!-- form -->
                    <form class="login-form1" method="POST">
                        <div class="h252 pl20 pr20">
                            <div class="w100p">
                                <div class="h40 center">
                                    <div class="warning fs10 color-r" id = "error">错误提示</div>
                                </div>

                            </div>
                            <div class="w100p">
                                <div class="h50 center">
                                    <label for="username"  class="itxt-icon"><img src=""></label>
                                    <input placeholder="邮箱/用户名/已验证手机" id="username" class="itxt" type="text" name="username" autocomplete="off">
                                </div>
                            </div>
                            <div class="w100p">
                                <div class="h50 center pt10">
                                    <label for="password" class="itxt-icon"><img src=""></label>
                                    <input placeholder="密码" id="password" class="itxt" type="password" name="password" autocomplete="off">
                                </div>
                            </div>
                            <div class="w100p">
                                <div class="h32 right-link">
                                    <div class="fr fs10 pt10"><a href="">忘记密码</a></div>
                                </div>
                            </div>
                            <div class="w100p">
                                <div class="h50 center">
                                    <button  class="loginBtn" type="submit" >登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
                                   <!-- <div class="login-btn"><a href="javascript:asdf()">登&nbsp;&nbsp;&nbsp;&nbsp;录</a></div>-->
                                </div>
                            </div>
                        </div>

                    </form>
                    <!-- wechat  -->
                    <div class="w90p">
                        <div class="login-plus h50 pt15">
                            <ul>
                                <li class="fl fs20 mr10">QQ</li>
                                <li class="fl fs20 mr10">|</li>
                                <li class="fl fs20 mr10">微信</li>
                                <a href="/register" class="fr fs20 color-r" >立即注册</a>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </div>
</div>
</body>
</html>
