<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    <link rel="stylesheet" type="text/css" href="../css/zTreeStyle/zTreeStyle.css"/>
    <link rel="stylesheet" type="text/css" href="../css/skin_/nav.css"/>
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript" src="../js/global.js"></script>
    <title>底部内容页</title>
</head>

<body>
<div id="container">
    <div id="bd">
        <div class="sidebar">
            <div class="sidebar-bg"></div>
            <i class="sidebar-hide"></i>
            <ul class="nav">
                <li class="nav-li current">
                    <a href="javascript:;" class="ue-clear">
	                    <i class="nav-ivon"></i>
	                    <span class="nav-text">居民健康管理</span>
                    </a>
                    <ul class="subnav">
                        <li class="subnav-li" href="${pageContext.request.contextPath}/resident?action=query" data-id="1-1">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">居民基本信息</span>
	                        </a>
                        </li>
                        <li class="subnav-li" href="${pageContext.request.contextPath}/residentHealthy?action=query"  data-id="1-2">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">居民健康管理</span>
	                        </a>
                        </li>
                        <li class="subnav-li" href="${pageContext.request.contextPath}/hypertension?action=query" data-id="1-3">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">高血压患者管理</span>
	                        </a>
                        </li>
                        <li class="subnav-li" href="${pageContext.request.contextPath}/diabetes?action=query" data-id="1-4">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">糖尿病患者管理</span>
	                        </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span
                            class="nav-text">特殊群体健康管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="${pageContext.request.contextPath}/childrenHealthy?action=query" data-id="2-1">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">儿童健康管理</span>
	                        </a>
                        </li>
                       <li class="subnav-li" href="${pageContext.request.contextPath}/childrenVaccine?action=query" data-id="2-2">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">儿童疫苗接种管理</span>
	                        </a>
                        </li>
						<li class="subnav-li" href="${pageContext.request.contextPath}/maternal?action=query" data-id="2-3">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">孕产妇健康管理</span>
	                        </a>
                        </li>
                        <li class="subnav-li" href="${pageContext.request.contextPath}/elderly?action=query" data-id="2-4">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">老年人健康管理</span>
	                        </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span
                            class="nav-text">健康教育管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="${pageContext.request.contextPath}/personal?action=query" data-id="3-1">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">个人健康教育管理</span>
	                        </a>
                        </li>
                       <li class="subnav-li" href="${pageContext.request.contextPath}/group?action=query" data-id="3-2">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">群体健康教育管理</span>
	                        </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-li last-nav-li"">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span
                            class="nav-text">传染病管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="${pageContext.request.contextPath}/infectious?action=query" data-id="4-1">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">传染病患者管理</span>
	                        </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-li last-nav-li" <c:if test="${user.rights=='general' }">style="display:none"</c:if> >
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span
                            class="nav-text">系统管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="${pageContext.request.contextPath}/user?action=query" data-id="5-1">
	                        <a href="javascript:;" class="ue-clear">
		                        <i class="subnav-icon"></i>
		                        <span class="subnav-text">系统用户管理</span>
	                        </a>
                        </li>
                    </ul>
                </li>
            <div class="tree-list outwindow">
                <div class="tree ztree"></div>
            </div>
        </div>
        <div class="main">
            <div class="title">
                <i class="sidebar-show"></i>
                <ul class="tab ue-clear">

                </ul>
                <i class="tab-more"></i>
                <i class="tab-close"></i>
            </div>
            <div class="content">
            </div>
        </div>
    </div>
</div>

<div class="more-bab-list">
    <ul></ul>
    <div class="opt-panel-ml"></div>
    <div class="opt-panel-mr"></div>
    <div class="opt-panel-bc"></div>
    <div class="opt-panel-br"></div>
    <div class="opt-panel-bl"></div>
</div>
</body>
<script type="text/javascript" src="../js/nav.js"></script>
<script type="text/javascript" src="../js/Menu.js"></script>
<script type="text/javascript" src="../js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript">
    var menu = new Menu({
        defaultSelect: $('.nav').find('li[data-id="1-1"]')
    });
</script>
</html>