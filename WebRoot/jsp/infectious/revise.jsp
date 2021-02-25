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
<title>传染病患者信息</title>
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
	           	<form action="${pageContext.request.contextPath}/infectious?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${infectious.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear">
	                	<label>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${infectious.name }" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${infectious.rId }" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${infectious.birthday }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${infectious.phone }" name="phone"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${infectious.address }" name="address"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear time">
						<label>发病日期</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.startDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="startDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label>诊断时间</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.diagnosisDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" name="diagnosisDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>报卡类别</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.cardType }" name="cardType"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>传染病类型</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.type }" name="type"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>病例分类</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.category }" name="category"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>病人职业</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.occupation }" name="occupation"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>报告医生</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.doctorReport }" name="doctorReport"/>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label>登记日期</label>
						<div class="kv-item-content">
					     	<input type="text" value="${infectious.registrationDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="registrationDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
	                <a href="${pageContext.request.contextPath}/infectious?action=query" ><input class="button" type="button" value="取消" /></a>
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
