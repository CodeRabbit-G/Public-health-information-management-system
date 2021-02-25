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
	<title>居民基础信息</title>
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
	           	<form action="${pageContext.request.contextPath}/resident?action=add" method="post">
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
	                <div class="kv-item ue-clear">
	                	<label><span class="impInfo">*</span>民族</label>
	                	<div class="kv-item-content" >
	                    	<select name="nation">
	                        	<option value="汉族">汉族</option>
	                            <option value="壮族">壮族</option>
	                            <option value="苗族">苗族</option>
	                        </select>
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
	                	<label>居住地址</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="居住地址" name="address"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>籍贯</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="籍贯" name="province"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>文化程度</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="文化程度" name="diploma"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>职业</label>
	                	<div class="kv-item-content">
	                    	<input type="text" placeholder="职业" name="occupation"/>
	                    </div>
	                </div>
	                <div class="kv-item ue-clear">
	                	<label>婚姻情况</label>
	                    <div class="kv-item-content" >
	                    	<select name="marriage">
	                    		<option value="未婚">未婚</option>
	                        	<option value="已婚">已婚</option>
	                            <option value="丧偶">丧偶</option>
	                            <option value="离婚">离婚</option>
	                        </select>
	                    </div>
	                </div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="添加" />
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
