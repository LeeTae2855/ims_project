<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계좌 등록</title>
</head>
<body>
	<form id="form" action="/account/add" method="post">
		계좌번호: <input type='text' id='accountNo' name='accountNo' /><br />
		계좌명: <input type='text' id='accountName' name='accountName' /><br />
		계좌구분: 
			<input type='radio' id='purchase' name='accountCfc' value='PURCHASE' checked/>
			<label for='purchase'>매입</label>
			<input type='radio' id='sales' name='accountCfc' value='SALES' />
			<label for='sales'>매출</label>
			<input type='radio' id='book' name='accountCfc' value='BOOK' />
			<label for='book'>장부</label><br />
		예금주: <input type='text' id='masterName' name='masterName' /><br />
		휴대전화: <input type='text' id='cellphone' name='cellphone' /><br />
		은행명/개설지: <input type='text' id='bankName' name='bankName' /><br /> 
		자사계좌여부: <input type='radio' id='y' name='isowner' value='1' checked/>
					<label for='y'>예</label>&nbsp;&nbsp;&nbsp;
					<input type='radio' id='n' name='isowner' value='0' />
					<label for='n'>아니오</label><br />
		비고: <textarea rows='5' cols='30' name='note'></textarea>
		<input type='submit' id='submit' name='submit' value='등록' />
	</form>
</body>
</html>