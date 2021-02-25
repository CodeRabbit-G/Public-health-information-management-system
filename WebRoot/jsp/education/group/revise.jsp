<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="css/skin_/form.css" />
<script type="text/javascript" src="js/WdatePicker.js"></script>
<title>群体健康教育信息</title>
</head>

<body>
<div id="container">
	<div id="hd">
    </div>
    <div id="bd">
	    	<div id="main">
	            <h2 class="subfild">
	            	<span>修改信息</span>
	            </h2>
	           	<form action="${pageContext.request.contextPath}/group?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${group.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear time">
						<label>教育时间</label>
						<div class="kv-item-content">
					     	<input type="text" value="${group.eduDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="eduDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>教育主题</label>
						<div class="kv-item-content">
					     	<input type="text" value="${group.eduTheme }" name="eduTheme"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>教育类型</label>
						<div class="kv-item-content">
					     	<input type="text" value="${group.eduType }" name="eduType"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>教育地点</label>
						<div class="kv-item-content">
					     	<input type="text" value="${group.eduPlace }" name="eduPlace"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>参与对象</label>
						<div class="kv-item-content">
					     	<input type="text" value="${group.eduObject }" name="eduObject"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>参与人数</label>
						<div class="kv-item-content">
					     	<input type="text" value="${group.eduNumber }" name="eduNumber"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>教育内容</label>
						<div class="kv-item-content">
					     	<textarea id="content" name="eduContent" style="width:800px;height:240px;">${group.eduContent }</textarea>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
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
