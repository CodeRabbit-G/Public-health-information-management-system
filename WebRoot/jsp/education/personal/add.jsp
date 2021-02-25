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
	<title>个人健康教育信息</title>
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
	           	<form action="${pageContext.request.contextPath}/personal?action=add" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label><span class="impInfo">*</span>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="姓名" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label><span class="impInfo">*</span>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="居民身份证" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label><span class="impInfo">*</span>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="出生日期" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label><span class="impInfo">*</span>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="联系电话" name="phone"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>教育医生</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育医生" name="eduDoctor"/>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label><span class="impInfo">*</span>教育时间</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育时间" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="eduDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>教育方式</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育方式" name="eduMode"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>教育主题</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="教育主题" name="eduTheme"/>
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
	                <a href="${pageContext.request.contextPath}/personal?action=query" ><input class="button" type="button" value="取消" /></a>
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
