<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계좌 장부</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th style="text-align: center;">계좌번호</th>
				<th style="text-align: center;">계좌명/별칭</th>
				<th style="text-align: center;">구분</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${!empty listAccount}">
				<c:forEach items="${listAccount}" var="list" varStatus="status">
					<tr>
						<td style="text-align: center;"><c:out
								value="${list.accountNo}" /></td>
						<td style="text-align: center;"><c:out
								value="${list.accountName}" /></td>
						<td style="text-align: center;"><c:out
								value="${list.accountCfc}" /></td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty listAccount}">
				<tr>
					<td style="text-align: center;" colspan="7">목록이 존재하지 않습니다.</td>
				</tr>
			</c:if>
		</tbody>
	</table>
</body>
</html>