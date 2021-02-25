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
<title>儿童健康信息</title>
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
	           	<form action="${pageContext.request.contextPath}/childrenHealthy?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${childrenHealthy.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear">
	                	<label>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${childrenHealthy.name }" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${childrenHealthy.rId }" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>性别</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="男" <c:if test="${childrenHealthy.sex=='男' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">男</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="女" <c:if test="${childrenHealthy.sex=='女' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">女</span>
	                        </span>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${childrenHealthy.birthday }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${childrenHealthy.phone }" name="phone"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>现住址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${childrenHealthy.address }" name="address"/>
	                    </div>
	                </div>
					<div class="kv-item ue-clear">
	                	<label>是否体弱儿</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="infirmity" value="是" <c:if test="${childrenHealthy.infirmity=='是' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">是</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="infirmity" value="否" <c:if test="${childrenHealthy.infirmity=='否' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">否</span>
	                        </span>
	                    </div>
	                </div>
					<div class="kv-item ue-clear">
						<label>体弱因素</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.infirmityFactor }" name="infirmityFactor"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>新生访视数</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.visit }" name="visit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>1岁内体检数</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.oneYears }" name="oneYears"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>1-2岁体检数</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.twoYears }" name="twoYears"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>3-6岁体检数</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.sixYears }" name="sixYears"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>母亲</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.mother }" name="mother"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>父亲</label>
						<div class="kv-item-content">
					     	<input type="text" value="${childrenHealthy.father }" name="father"/>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
	                <a href="${pageContext.request.contextPath}/childrenHealthy?action=query" ><input class="button" type="button" value="取消" /></a>
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
