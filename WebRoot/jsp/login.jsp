<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7"/>
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/skin_/login.css"/>
    <script type="text/javascript" src="<%=path%>/js/jquery.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery.select.js"></script>
    <title>公共卫生信息管理系统_用户登录</title>
</head>

<body>
	<div id="container">
	    <div id="bd">
	        <div id="main">
	            <div class="login-box">
	                <div id="logo"></div>
	                <form action="${pageContext.request.contextPath}/user?action=login" method="post">
		                <div class="input username" id="username">
		                    <label for="userName">用户名</label>
		                    <span></span>
		                    <input type="text" name="name" style="width: 244px;"/>
		                </div>
		                <div class="input psw" id="psw">
		                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
		                    <span></span>
		                    <input type="password" name="password" style="width: 244px;"/>
		                </div>
		                <div class="input validate" id="validate">
		                    <label for="valiDate">验证码</label>
		                    <input type="text" name="code" style="width: 244px;"/>
		                    <div class="value" style="left: 220px; top: 5px;"><img src="${pageContext.request.contextPath }/codeImage"></img></div>
		                </div>
		            </form>
	                <div id="btn" class="loginButton">
	                    <input type="button" class="button" value="登录"/>
	                </div>
	            </div>
	        </div>
	        <div id="ft">CopyRight&nbsp;2020&nbsp;&nbsp;版权所有&nbsp;&nbsp;公共卫生信息管理系统</div>
	    </div>
	</div>
</body>

<script type="text/javascript">
    var height = $(window).height() > 445 ? $(window).height() : 445;
    $("#container").height(height);
    var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
    $('#bd').css('padding-top', bdheight);
    $(window).resize(function (e) {
        var height = $(window).height() > 445 ? $(window).height() : 445;
        $("#container").height(height);
        var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
        $('#bd').css('padding-top', bdheight);
    });
    
    $('.loginButton').click(function (e) {
        document.forms[0].submit();
    });
    
</script>
</html>