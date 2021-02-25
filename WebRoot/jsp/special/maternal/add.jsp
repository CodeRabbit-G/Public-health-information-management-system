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
	<title>孕产妇健康信息</title>
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
	           	<form action="${pageContext.request.contextPath}/maternal?action=add" method="post">
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
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="当前居住地址" name="address"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear time">
						<label>预产期</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="预产期" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="expected"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>分娩记录</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="分娩记录" name="deliveryRecord"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>第1次随访</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="第1次随访" name="oneVisit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>建档孕周</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="建档孕周" name="gestationalAge"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>2-5次随访</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="2-5次随访" name="twoVisit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>产后访视</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="产后访视" name="postpartumVisit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>产后42天</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="产后42天" name="postpartum42Day"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
	                	<label>分娩方式</label>
	                	<div class="kv-item-content" >
	                    	<select name="deliveryMode">
	                        	<option value="自然分娩">自然分娩</option>
	                            <option value="剖腹分娩">剖腹分娩</option>
	                            <option value="无痛分娩">无痛分娩</option>
	                            <option value="水中分娩">水中分娩</option>
	                        </select>
	                    </div>
	                </div>
					<div class="kv-item ue-clear time">
						<label>分娩日期</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="分娩日期" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="deliveryDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>婴儿姓名</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="婴儿姓名" name="babyName"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>婴儿性别</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="婴儿性别" name="babySex"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>丈夫</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="丈夫" name="husband"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>保健卡号</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="保健卡号" name="healthCard"/>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label>登记日期</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="登记日期" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="registrationDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="添加" />
	                <a href="${pageContext.request.contextPath}/maternal?action=query" ><input class="button" type="button" value="取消" /></a>
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
