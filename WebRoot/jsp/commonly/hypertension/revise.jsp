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
<title>高血压患者信息</title>
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
	           	<form action="${pageContext.request.contextPath}/hypertension?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${hypertension.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear">
	                	<label>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${hypertension.name }" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${hypertension.rId }" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>性别</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="男" <c:if test="${hypertension.sex=='男' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">男</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="女" <c:if test="${hypertension.sex=='女' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">女</span>
	                        </span>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${hypertension.birthday }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${hypertension.phone }" name="phone"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${hypertension.address }" name="address"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear">
						<label>血压</label>
						<div class="kv-item-content">
					     	<input type="text" value="${hypertension.bloodPressure }" name="bloodPressure"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>高血压等级</label>
						<div class="kv-item-content">
					     	<input type="text" value="${hypertension.grade }" name="grade"/>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label>体检日期</label>
						<div class="kv-item-content">
							<input type="text" value="${hypertension.testDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="testDate"/>
					     	<i class="time-icon"></i>
					    </div>
	                </div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
	                <a href="${pageContext.request.contextPath}/hypertension?action=query" ><input class="button" type="button" value="取消" /></a>
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
