<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action='/bd/list' method='post'>
		<table>
			<tr>
				<td><select id='findOption' name='findOption'>
						<option value='NONE' selected>-- 선택 --</option>
						<option value='ITEM_CODE'>제품코드</option>
						<option value='ITEM_NAME'>제품명</option>
						<option value='CLIENT_NAME'>거래처명</option>
						<option value='CON_VER'>적요</option>
				</select></td>
				<td><input type='text' id='keyword' name='keyword' /></td>
				<td><input type='submit' id='submit' name='submit' value='검색' /></td>
			</tr>
		</table>
	</form>
	<center>
		<table border="1" width="500">
			<thead>
				<tr>
					<th>등록번호</th>
					<th>품목명</th>
					<th>거래처명</th>
					<th>거래완료일</th>
					<th>매출수량</th>
					<th>금액</th>
					<th>적요</th>
					<th>비고</th>
					<th>주문서</th>
					<th>상세보기</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listBD }">
					<c:forEach var="bd" items="${listBD}" varStatus="status">
						<tr>
							<td><c:out value="${bd.bdNo}" /></td>
							<td><c:out value="${bd.itemName}" /></td>
							<td><c:out value="${bd.clientName}" /></td>
							<td><c:out value="${bd.bdDate}" /></td>
							<td><c:out value="${bd.quantity}" /></td>
							<td><c:out value="${bd.ammount}" /></td>
							<td><c:out value="${bd.conVer}" /></td>
							<td><c:out value="${bd.note}" /></td>
							<td><input type='button' id='scroll' name='scroll'
								value='주문서' onclick='' /></td>
							<td><a href="/bd/view/${bd.bdNo}"> <input type='button'
									id='view' name='view' value='상세' />
							</a></td>
							<td><a href='/bd/edit/${bd.bdNo}'> <input type='button'
									id='edit' name='edit' value='수정' />
							</a></td>
							<td><a href='/bd/remove/${bd.bdNo}'> <input
									type='button' id='remove' name='remove' value='삭제' />
							</a></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</center>
</body>
</html>