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
<title>居民基础信息</title>
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
	           	<form action="${pageContext.request.contextPath}/resident?action=update" method="post">
	            <div class="subfild-content base-info">
	            	<div class="kv-item ue-clear">
	                	<label>档案号</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.id }" name="id" readonly="readonly"/>
	                    </div>
	                </div>
	            	<div class="kv-item ue-clear">
	                	<label>姓名</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.name }" name="name"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居民身份证</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.rId }" name="rId"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>性别</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="男" <c:if test="${resident.sex=='男' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">男</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="sex" value="女" <c:if test="${resident.sex=='女' }">checked="checked"</c:if> />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">女</span>
	                        </span>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>民族</label>
	                	<div class="kv-item-content" >
	                    	<select name="nation">
	                        	<option value="汉族" <c:if test="${resident.nation=='汉族' }">selected="selected"</c:if> >汉族</option>
	                            <option value="壮族" <c:if test="${resident.nation=='壮族' }">selected="selected"</c:if> >壮族</option>
	                            <option value="苗族" <c:if test="${resident.nation=='苗族' }">selected="selected"</c:if> >苗族</option>
	                        </select>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear time">
	                	<label>出生日期</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.birthday }" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" name="birthday" />
                       		<i class="time-icon"></i>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>联系电话</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.phone }" name="phone"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>居住地址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.address }" name="address"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>籍贯</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.province }" name="province"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>文化程度</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.diploma }" name="diploma"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>职业</label>
	                	<div class="kv-item-content">
	                    	<input type="text" value="${resident.occupation }" name="occupation"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>婚姻情况</label>
	                	<div class="kv-item-content">
	                    	<select name="marriage">
	                    		<option value="未婚" <c:if test="${resident.nation=='未婚' }">selected="selected"</c:if> >未婚</option>
	                        	<option value="已婚" <c:if test="${resident.nation=='已婚' }">selected="selected"</c:if> >已婚</option>
	                            <option value="丧偶" <c:if test="${resident.nation=='丧偶' }">selected="selected"</c:if> >丧偶</option>
	                            <option value="离婚" <c:if test="${resident.nation=='离婚' }">selected="selected"</c:if> >离婚</option>
	                        </select>
	                    </div>
	                </div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="修改" />
	                <a href="${pageContext.request.contextPath}/resident?action=query" ><input class="button" type="button" value="取消" /></a>
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
