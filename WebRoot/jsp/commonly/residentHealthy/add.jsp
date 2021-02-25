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
	<title>居民健康信息</title>
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
	           	<form action="${pageContext.request.contextPath}/residentHealthy?action=add" method="post">
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
	                <div class="kv-item ue-clear">
	                	<label><span class="impInfo">*</span>性别</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="男" checked="checked" />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">男</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="女" />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">女</span>
	                        </span>
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
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="当前居住地址" name="address"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
						<label>脉搏</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="脉搏" name="pulse"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>身高</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="身高" name="height"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>体重</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="体重" name="weight"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>血压</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="血压" name="bloodPressure"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>健康评估</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="健康评估" name="healtAssessment"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>责任医生</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="责任医生" name="responsibleDoctor"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>药物过敏史</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="药物过敏史" name="allergy"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>疾病史</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="疾病史" name="disease"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>受伤史</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="手术、外伤、输血史" name="surgery"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>家族史</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="家族史" name="family"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>残疾情况</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="残疾情况" name="disability"/>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="添加" />
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
