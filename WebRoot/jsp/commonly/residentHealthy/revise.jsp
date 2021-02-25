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
<title>居民健康信息</title>
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
	           	<form action="${pageContext.request.contextPath}/residentHealthy?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${residentHealthy.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear">
	                	<label>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${residentHealthy.name }" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${residentHealthy.rId }" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>性别</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="男" <c:if test="${residentHealthy.sex=='男' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">男</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="女" <c:if test="${residentHealthy.sex=='女' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">女</span>
	                        </span>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${residentHealthy.birthday }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${residentHealthy.phone }" name="phone"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${residentHealthy.address }" name="address"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
						<label>脉搏</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.pulse }" name="pulse"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>身高</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.height }" name="height"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>体重</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.weight }" name="weight"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>血压</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.bloodPressure }" name="bloodPressure"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>健康评估</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.healtAssessment }" name="healtAssessment"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>责任医生</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.responsibleDoctor }" name="responsibleDoctor"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>药物过敏史</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.allergy }" name="allergy"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>疾病史</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.disease }" name="disease"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>受伤史</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.surgery }" name="surgery"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>家族史</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.family }" name="family"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>残疾情况</label>
						<div class="kv-item-content">
					     	<input type="text" value="${residentHealthy.disability }" name="disability"/>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
	                <a href="${pageContext.request.contextPath}/residentHealthy?action=query" ><input class="button" type="button" value="取消" /></a>
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
