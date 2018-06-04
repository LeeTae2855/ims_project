<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>

<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	window.alert = function() {
	};
	var defaultCSS = document.getElementById('bootstrap-css');
	function changeCSS(css) {
		if (css)
			$('head > link')
					.filter(':first')
					.replaceWith(
							'<link rel="stylesheet" href="'+ css +'" type="text/css" />');
		else
			$('head > link').filter(':first').replaceWith(defaultCSS);
	}
	$(document).ready(function() {
		var iframe_height = parseInt($('html').height());
		window.parent.postMessage(iframe_height, 'https://bootsnipp.com');
	});
</script>





<meta name="robots" content="noindex, nofollow">


<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<style type="text/css">
/*
    DEMO STYLE
*/
@import
	"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700";

#div2 {
	width: 850px;
	height: 100%;
}

body {
	font-family: 'Poppins', sans-serif;
	background: #fafafa;
}

p {
	font-family: 'Poppins', sans-serif;
	font-size: 1.1em;
	font-weight: 300;
	line-height: 1.7em;
	color: #999;
}

a, a:hover, a:focus {
	color: inherit;
	text-decoration: none;
	transition: all 0.3s;
}

.navbar {
	padding: 15px 10px;
	background: #fff;
	border: none;
	border-radius: 0;
	margin-bottom: 40px;
	box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.1);
}

.navbar-btn {
	box-shadow: none;
	outline: none !important;
	border: none;
}

.line {
	width: 100%;
	height: 1px;
	border-bottom: 1px dashed #ddd;
	margin: 40px 0;
}

<!--
-->
.container {
	padding-bottom: 10px;
	float: right;
	align-items: stretch;
	position: static;
	float: right
}
/* ---------------------------------------------------
    SIDEBAR STYLE
----------------------------------------------------- */
.wrapper {
	display: flex;
	align-items: stretch;
}

#sidebar {
	min-width: 250px;
	max-width: 250px;
	background: #7386D5;
	color: #fff;
	transition: all 0.3s;
}

#sidebar.active {
	margin-left: -250px;
}

#sidebar .sidebar-header {
	padding: 20px;
	background: #6d7fcc;
}

#sidebar ul.components {
	padding: 20px 0;
	border-bottom: 1px solid #47748b;
}

#sidebar ul p {
	color: #fff;
	padding: 10px;
}

#sidebar ul li a {
	padding: 10px;
	font-size: 1.1em;
	display: block;
}

#sidebar ul li a:hover {
	color: #7386D5;
	background: #fff;
}

#sidebar ul li.active>a, a[aria-expanded="true"] {
	color: #fff;
	background: #6d7fcc;
}

a[data-toggle="collapse"] {
	position: relative;
}

a[aria-expanded="false"]::before, a[aria-expanded="true"]::before {
	content: '\e259';
	display: block;
	position: absolute;
	right: 20px;
	font-family: 'Glyphicons Halflings';
	font-size: 0.6em;
}

a[aria-expanded="true"]::before {
	content: '\e260';
}

ul ul a {
	font-size: 0.9em !important;
	padding-left: 30px !important;
	background: #6d7fcc;
}

ul.CTAs {
	padding: 20px;
}

ul.CTAs a {
	text-align: center;
	font-size: 0.9em !important;
	display: block;
	border-radius: 5px;
	margin-bottom: 5px;
}

a.download {
	background: #fff;
	color: #7386D5;
}

a.article, a.article:hover {
	background: #6d7fcc !important;
	color: #fff !important;
}
/* ---------------------------------------------------
    CONTENT STYLE
----------------------------------------------------- */
#content {
	padding: 20px;
	min-height: 100vh;
	transition: all 0.3s;
}
/* ---------------------------------------------------
    MEDIAQUERIES
----------------------------------------------------- */
@media ( max-width : 768px) {
	#sidebar {
		margin-left: -250px;
	}
	#sidebar.active {
		margin-left: 0;
	}
	#sidebarCollapse span {
		display: none;
	}
}

.pagination {
	display: block;
	text-align: center;
}

.pagination>li>a {
	float: none;
	margin-left: -5px;
}
</style>
<script type="text/javascript">
	function div2Resize() {
		var div2 = document.getElementById('div2');
		div2.style.width = window.innerWidth - 350 + 'px';
	}
	window.onload = function() {
		div2Resize();
		// 브라우저 크기가 변할 시 동적으로 사이즈를 조절해야 하는경우
		window.addEventListener('resize', div2Resize);
	}
</script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	window.alert = function() {
	};
	var defaultCSS = document.getElementById('bootstrap-css');
	function changeCSS(css) {
		if (css)
			$('head > link')
					.filter(':first')
					.replaceWith(
							'<link rel="stylesheet" href="'+ css +'" type="text/css" />');
		else
			$('head > link').filter(':first').replaceWith(defaultCSS);
	}
	$(document).ready(function() {
		var iframe_height = parseInt($('html').height());
		window.parent.postMessage(iframe_height, 'https://bootsnipp.com');
	});
</script>



</head>
<body>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="style.css">

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	window.alert = function() {
	};
	var defaultCSS = document.getElementById('bootstrap-css');
	function changeCSS(css) {
		if (css)
			$('head > link')
					.filter(':first')
					.replaceWith(
							'<link rel="stylesheet" href="'+ css +'" type="text/css" />');
		else
			$('head > link').filter(':first').replaceWith(defaultCSS);
	}
	$(document).ready(function() {
		var iframe_height = parseInt($('html').height());
		window.parent.postMessage(iframe_height, 'https://bootsnipp.com');
	});
	function toggle(id, id2) {
		var n = document.getElementById(id);
		if (n.style.display != 'none') {
			n.style.display = 'none';
			document.getElementById(id2).setAttribute('aria-expanded', 'false');
		} else {
			n.style.display = '';
			document.getElementById(id2).setAttribute('aria-expanded', 'true');
		}
	}
</script>
<script type="text/javascript">
	var openWin;

	function accountPopupOpen() {
		window.name = "accountPopup";

		var option = "width=700, height=410, resizable=no, scrollbars=no, status=no, toolbar=yes, directories=yes, menubar=yes, location=no;";
		openWin = window.open("/account/popup", "acPopup", option);
	}

	function clientPopupOpen() {
		window.name = "clientPopup";

		var option = "width=700, height=410, resizable=no, scrollbars=no, status=no, toolbar=yes, directories=yes, menubar=yes, location=no;";
		openWin = window.open("/client/popup", "clPopup", option);
	}
</script>
</head>
<body>

	<div class="wrapper">
		<!-- Sidebar Holder -->
		<nav id="sidebar">
			<div class="sidebar-header">
				<h3>메뉴</h3>
			</div>

			<ul class="list-unstyled components">

				<li class="active"><a href="#homeSubmenu"
					data-toggle="collapse" aria-expanded="true" id='hsubmenu'
					onclick="toggle('homeSubmenu', 'hsubmenu');"> 거래내역 </a>
					<ul class="collapse list-unstyled" id="homeSubmenu">
						<li><a href="#" style="color: white"> 매입현황 </a></li>
						<li><a href="#" style="color: white"> 매출현황 </a></li>
						<li><a href="#" style="color: white"> 발주예약 </a></li>
						<li><a href="#" style="color: white"> 수주예약 </a></li>
						<li><a href="#" style="color: white"> 대체거래 </a></li>
						<li><a href="#" style="color: white"> 입금거래 </a></li>
						<li><a href="#" style="color: white"> 출금거래 </a></li>
					</ul></li>
				<li class="active"><a href="#pageSubmenu"
					data-toggle="collapse" aria-expanded="true" id='psubmenu'
					onclick="toggle('pageSubmenu', 'psubmenu');"> 기초정보 </a>
					<ul class="collapse list-unstyled" id="pageSubmenu">
						<li><a href="#" style="color: white"> 계좌/장부 조회 </a></li>
						<li><a href="#" style="color: white"> 담당자 조회 </a></li>
						<li><a href="#" style="color: white"> 거래처 조회 </a></li>
						<li><a href="#" style="color: white"> 재고조회 </a></li>
					</ul></li>
				<li class="active"><a href="#bogoSubmenu"
					data-toggle="collapse" aria-expanded="true" id='bsubmenu'
					onclick="toggle('bogoSubmenu', 'bsubmenu');"> 보고서 </a>
					<ul class="collapse list-unstyled" id="bogoSubmenu">
						<li><a href="#" style="color: white"> 손익보고서 </a></li>
						<li><a href="#" style="color: white"> 발주서 </a></li>
						<li><a href="#" style="color: white"> 주문서 </a></li>
					</ul>
		</nav>

		<!-- Page Content Holder -->
		<div id="content">

			<nav class="navbar navbar-default">
				<div class="container-fluid">

					<div class="navbar-header">
						<button type="button" id="sidebarCollapse"
							class="btn btn-info navbar-btn">
							<i class="glyphicon glyphicon-align-left"></i> <span>Sidebar</span>
						</button>
					</div>

					<div id="div2">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#"> 계좌/장부 조회 </a></li>
							<li><a href="#"> 담장자 조회 </a></li>
							<li><a href="#"> 거래처 조회 </a></li>
							<li><a href="#"> 재고 조회 </a></li>
						</ul>
					</div>
				</div>
			</nav>
			<h3>품목 등록</h3>

			<br> <label for="sel1"><h4>[품목 정보]</h4></label> <br> <label
				for="sel1"> 품목 코드 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="itemCode"
					placeholder="itemCode">
				<c:out value="${item.itemCode}" />
			</div>
			<br>
			<div class="form-group">
				<label for="sel1"> 품목구분 </label> <select class="form-control" id="itemCfc" 
				placeholder="itemCfc">
				<c:out value="${item.itemCfc}" />
					<option>상품</option>
					<option>제품</option>
					<option>부품</option>
					<option>반제품</option>
					<option>세트</option>
				</select>
			</div>
			<br> <label for="sel1"> 품목명 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="itemName"
					placeholder="itemName">
				<c:out value="${item.itemName}" />
			</div>
			<br> <label for="sel1"> 규격/별칭 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="standard"
					placeholder="standard">
				<c:out value="${item.standard}" />
			</div>
			<br> <label for="sel1"> 기초 재고량 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="baseQuantity"
					placeholder="baseQuantity">
				<c:out value="${item.baseQuantity}" />
			</div>
			<br> <label for="sel1"> 재고상태 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="itemStatus"
					placeholder="itemStatus">
				<c:out value="${item.Status}" />
			</div>
			<br> <label for="sel1"> 사용(조회) 가능여부 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="useable"
					placeholder="useable">
				<c:out value="${item.useable}" />
			</div>

			<br>
			<br> <label for="sel1"><h4>[입금정보]</h4></label> <br> <label
				for="sel1"> 거래처 </label>
			<div class="col-sm-20">
				<!-- 버튼 -->
				<input type="text" class="form-control" id="clientNo"
					placeholder="선택" onclick='clientPopupOpen();'>
			</div>
			<br> <label for="sel1"> 거래 계좌 </label> <br> <input
				type="text" class="form-control" id="accountNo" placeholder="선택"
				onclick='accountPopupOpen();'> <br> <label for="sel1">
				거래 금액 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="ammount"
					placeholder="금액">
			</div>
			<br> <label for="sel1"> 세액 </label>
			<div class="col-sm-20">
				<input type="text" class="form-control" id="tax" placeholder="세액">
			</div>
			<div class="col-sm-20">
				<br> <label for="sel1">적요 </label>
				<div class="col-sm-20">
					<input type="text" class="form-control" id="conVer"
						placeholder="내용"> <br>
					<div class="form-group">
						<label for="comment"> 비고 </label>
						<textarea class="form-control" rows="10" id="note"></textarea>
					</div>
					<button type="button" class="btn btn-primary btn-md">등록</button>
					<button type="button" class="btn btn-primary btn-md">닫기</button>
				</div>
			</div>

			<!-- jQuery CDN -->
			<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
			<!-- Bootstrap Js CDN -->
			<script
				src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

			<script type="text/javascript">
				$(document).ready(function() {
					$('#sidebarCollapse').on('click', function() {
						$('#sidebar').toggleClass('active');
					});
				});
			</script>


			<script type="text/javascript">
				$(document).ready(
						function() {
							$("#sidebar").mCustomScrollbar({
								theme : "minimal"
							});
							// when opening the sidebar
							$('#sidebarCollapse').on(
									'click',
									function() {
										// open sidebar
										$('#sidebar').addClass('active');
										// fade in the overlay
										$('.overlay').fadeIn();
										$('.collapse.in').toggleClass('in');
										$('a[aria-expanded=true]').attr(
												'aria-expanded', 'false');
									});
							// if dismiss or overlay was clicked
							$('#dismiss, .overlay').on('click', function() {
								// hide the sidebar
								$('#sidebar').removeClass('active');
								// fade out the overlay
								$('.overlay').fadeOut();
							});
						});
			</script>
</body>
</html>