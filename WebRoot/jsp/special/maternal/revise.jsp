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
<title>孕产妇健康信息</title>
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
	           	<form action="${pageContext.request.contextPath}/maternal?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${maternal.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear">
	                	<label>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${maternal.name }" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${maternal.rId }" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${maternal.birthday }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${maternal.phone }" name="phone"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${maternal.address }" name="address"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear time">
						<label>预产期</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.expected }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="expected"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>分娩记录</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.deliveryRecord }" name="deliveryRecord"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>第1次随访</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.oneVisit }" name="oneVisit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>建档孕周</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.gestationalAge }" name="gestationalAge"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>2-5次随访</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.twoVisit }" name="twoVisit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>产后访视</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.postpartumVisit }" name="postpartumVisit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>产后42天</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.postpartum42Day }" name="postpartum42Day"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
	                	<label>分娩方式</label>
	                	<div class="kv-item-content" >
	                    	<select name="deliveryMode">
	                        	<option value="自然分娩" <c:if test="${maternal.deliveryMode=='自然分娩' }">selected="selected"</c:if> >自然分娩</option>
	                            <option value="剖腹分娩" <c:if test="${maternal.deliveryMode=='剖腹分娩' }">selected="selected"</c:if> >剖腹分娩</option>
	                            <option value="无痛分娩" <c:if test="${maternal.deliveryMode=='无痛分娩' }">selected="selected"</c:if> >无痛分娩</option>
	                            <option value="水中分娩" <c:if test="${maternal.deliveryMode=='水中分娩' }">selected="selected"</c:if> >水中分娩</option>
	                        </select>
	                    </div>
	                </div>
					<div class="kv-item ue-clear time">
						<label>分娩日期</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.deliveryDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="deliveryDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>婴儿姓名</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.babyName }" name="babyName"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>婴儿性别</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.babySex }" name="babySex"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>丈夫</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.husband }" name="husband"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>保健卡号</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.healthCard }" name="healthCard"/>
					    </div>
					</div>
					<div class="kv-item ue-clear time">
						<label>登记日期</label>
						<div class="kv-item-content">
					     	<input type="text" value="${maternal.registrationDate }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="registrationDate"/>
					     	<i class="time-icon"></i>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
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
