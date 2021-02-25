<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="css/skin_/table.css" />
<link rel="stylesheet" type="text/css" href="css/jquery.grid.css" />


<title>表格</title>
</head>

<body>
	<div id="container">
		<div id="hd"></div>
		<div id="bd">
			<div id="main">
			<!--  -->
				<div class="search-box ue-clear">
					<div class="search-area">
						<div class="kv-item ue-clear">
							<label>搜索条件：</label>
							<div class="kv-item-content ue-clear">
								<span class="choose"> 
									<span class="checkboxouter">
										<input type="radio" name="factor" value="all" /> 
										<span class="radio"></span>
									</span> 
									<span class="text">全部</span>
								</span> 
								<span class="choose"> 
									<span class="checkboxouter">
										<input type="radio" name="factor" value="name" data-define="define" /> 
										<span class="radio"></span>
									</span> 
									<span class="text">姓名</span>
								</span> 
								<span class="choose"> 
									<span class="checkboxouter">
										<input type="radio" name="factor" value="rId" data-define="define" /> 
										<span class="radio"></span>
									</span> 
									<span class="text">身份证号</span>
								</span> 
								<span class="define-input"> 
									<input type="text" name="content" placeholder="搜索内容" style="width: 150px; 4"/> 
									<span class="division"></span> 
								</span>
							</div>
						</div>
					</div>
					<div class="search-button">
						<input class="button" type="button" onclick="_search();" value="搜索" />
					</div>
				</div>
				<!--  -->
				<div class="table">
					<div class="opt ue-clear">
						</span> <span class="optarea"> <a href="jsp/education/personal/add.jsp" class="add">
								<i class="icon"></i> <span class="text">添加</span>
						</a> <a href="javascript:;" class="delete" onclick="delAll()" > <i class="icon"></i> <span
								class="text">删除</span>
						</a>
						</span>
					</div>

					<div class="grid"></div>

					<div class="pagination"></div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/jquery.select.js"></script>
<script type="text/javascript" src="js/core.js"></script>
<script type="text/javascript" src="js/jquery.pagination.js"></script>
<script type="text/javascript" src="js/jquery.grid.js"></script>
<script type="text/javascript" src="js/WdatePicker.js"></script>
<script type="text/javascript">

	$('select').select();
	
	var head = [ {
		label : '档案号',
		width : 125,
	}, {
		label : '姓名',
		width : 70,
	}, {
		label : '身份证号',
		width : 155
	}, {
		label : '出生日期',
		Width : 100
	}, {
		label : '联系电话',
		width : 110
	}, {
		label : '教育医生',
		width : 70
	}, {
		label : '教育时间',
		Width : 100
	}, {
		label : '教育方式',
		width : 100
	}, {
		label : '教育主题',
		width : 150
	}, {
		label : '教育内容',
		minWidth: 300
	}];
	
	var curPage = ${currentPage}
	
	var tbody = [ ${personals} ]

	$('.grid').Grid({
		thead : head,
		tbody : null,
		height : 530,
		checkbox : {
			single : true
		},
		operator : {
			type : "normal",
			width : 100
		},
		sortCallBack : function(name, index, type) {
			alert(name + "," + index + ',' + type);
		}
	});

	$('.grid').Grid('addLoading');

	setTimeout(function() {
		$('.grid').Grid('setData', tbody, head);
	})

	$('.pagination').pagination(${count}, {
		callback : function(page) {
			window.location.href="${pageContext.request.contextPath}/personal?action=query&currentPage=" + page;
		},
		current_page: curPage,
		display_msg : false
	});

	$('.search-box input[type=radio]').click(function(e) {
		if ($(this).prop('checked')) {
			if ($(this).attr('data-define') === 'define') {
				$('.define-input').show();
			} else {
				$('.define-input').hide();
			}
		}
	});
	
	function delAll() {
		var delList = $('.grid').Grid('getCheckedIndex');
		if(delList!="" && window.confirm("是否继续删除，一旦删除将不可恢复！")){
			window.location.href="${pageContext.request.contextPath}/personal?action=delAll&delList=" + delList + '&currentPage=' + curPage;
		}
	}
	
	function _search(){
		var factor = $("input[name='factor']:checked").val();
		var content = $("input[name='content']").val();
		if(factor== null || factor=='all'){
			window.location.href="${pageContext.request.contextPath}/personal?action=query";
		}else{
			window.location.href="${pageContext.request.contextPath}/personal?action=search&factor=" + factor +"&content=" + content;
		}
	}
</script>
</html>
