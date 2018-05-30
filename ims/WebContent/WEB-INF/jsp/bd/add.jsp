<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계좌 등록</title>
<script type="text/javascript">
	var openWin;

	function bePopupOpen() {
		window.name = "bereleasedPopup";

		var option = "width=700, height=410, resizable=no, scrollbars=no, status=no, toolbar=yes, directories=yes, menubar=yes, location=no;";
		openWin = window.open("/be/popup", "bePopup", option);
	}
</script>
</head>
<body>
	<form id="form" action="/bd/add" method="post">
		수주 등록:
		<input type="text"
							style="text-align: left;"
							id=beNo name="beNo" value=""
							onclick="bePopupOpen();" />
		입금 정보 등록: 
			
		비고: <textarea rows='5' cols='30' name='note'></textarea>
		<input type='submit' id='submit' name='submit' value='등록' />
	</form>
</body>
</html>