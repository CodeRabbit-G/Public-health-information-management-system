<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css" />
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/WdatePicker.css" />
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/skin_/form.css" />
	<script type="text/javascript" src="<%=path%>/js/WdatePicker.js"></script>
	<title>群体健康教育信息</title>
</head>

<body>
<div id="container">
	<div id="hd">
    </div>
    <div id="bd">
	    	<div id="main">
	            <h2 class="subfild">
	            	<span>添加信息</span>
	            </h2>
	           	<form action="${pageContext.request.contextPath}/group?action=add" method="post">
	            <div class="subfild-content base-info">
		            <div class="kv-item ue-clear time">
						<label><span class="impInfo">*</span>教育时间</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育时间" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="eduDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>教育主题</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育主题" name="eduTheme"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>教育类型</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育类型" name="eduType"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>教育地点</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育地点或平台" name="eduPlace"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>参与对象</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="参与对象" name="eduObject"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>参与人数</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="参与人数" name="eduNumber"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>教育内容</label>
						<div class="kv-item-content">
					     	<textarea id="content" name="eduContent" placeholder="教育内容" style="width:800px;height:240px;"></textarea>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="添加" />
	                <a href="${pageContext.request.contextPath}/group?action=query" ><input class="button" type="button" value="取消" /></a>
	            </div>
			</div>

    </div>
</div>
</body>

<script type="text/javascript">
	
	function _save(){
		document.forms[0].submit();
	}
</script>
</html>
