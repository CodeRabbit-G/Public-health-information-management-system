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
	<title>儿童健康信息</title>
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
	           	<form action="${pageContext.request.contextPath}/childrenHealthy?action=add" method="post">
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
	                	<label><span class="impInfo">*</span>是否体弱儿</label>
	                	<div class="kv-item-content">
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="infirmity" value="是" />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">是</span>
	                        </span>
	                    	<span class="choose">
	                            <span class="checkboxouter">
	                                <input type="radio" name="infirmity" value="否" checked="checked" />
	                                <span class="radio"></span>
	                            </span>
	                            <span class="text">否</span>
	                        </span>
	                    </div>
	                </div>
					<div class="kv-item ue-clear">
						<label>体弱因素</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="体弱因素" name="infirmityFactor"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>新生访视数</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="新生儿访视次数" name="visit"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>1岁内体检数</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="1岁内体检次数" name="oneYears"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>1-2岁体检数</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="1-2岁体检次数" name="twoYears"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>3-6岁体检数</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="3-6岁体检次数" name="sixYears"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>母亲</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="母亲" name="mother"/>
					    </div>
					</div>
					<div class="kv-item ue-clear">
						<label>父亲</label>
						<div class="kv-item-content">
					     	<input type="text" placeholder="父亲" name="father"/>
					    </div>
					</div>
	            </div>
	            </form>
	            <div class="buttons">
	                <input class="button" type="button" onclick="_save();" value="添加" />
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
