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
	<title>传染病患者信息</title>
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
	           	<form action="${pageContext.request.contextPath}/infectious?action=add" method="post">
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
	                	<label><span class="impInfo">*</span>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="当前居住地址" name="address"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear time">
						<label><span class="impInfo">*</span>发病日期</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="发病日期" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="startDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label><span class="impInfo">*</span>诊断时间</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="诊断时间" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" name="diagnosisDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>报卡类别</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="报卡类别" name="cardType"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>传染病类型</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="传染病类型" name="type"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>病例分类</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="病例分类" name="category"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>病人职业</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="病人职业" name="occupation"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label><span class="impInfo">*</span>报告医生</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="报告医生" name="doctorReport"/>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label><span class="impInfo">*</span>登记日期</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="登记日期" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="registrationDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="添加" />
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
