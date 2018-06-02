<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>::: 수주예정 찾기 :::</title>
</head>
<body>
	<div style="align: center; width: 275px; height: 200; margin: auto;">
		<form action="/account/popup" method="post">
			<table style="border_color: white; align: center;">
				<tr>
					<td><select id="findOption" name="findOption">
							<option value='NONE' selected>-- 선택 --</option>
							<option value='NO'>계좌번호</option>
							<option value='NAME'>계좌명</option>
					</select></td>
					<td><input type="text" id="keyword" name="keyword" /></td>
					<td><input type="submit" value="검색" /></td>
				</tr>
			</table>
		</form>
	</div>
	<div style="align: left;">
		<table style="width: 100%;" border="1">
			<thead>
				<tr>
					<th>계좌번호</th>
					<th>계좌명</th>
					<th>계좌구분</th>
					<th>예금주</th>
					<th>등록</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listAccount}">
					<c:forEach items="${listAccount}" var="account" varStatus="status">
						<tr>
							<td style="text-align: center;"><c:out
									value="${account.accountNo}" /></td>
							<td style="text-align: center;"><c:out
									value="${account.accountName}" /></td>

							<td style="text-align: center;"><c:out
									value="${account.accountCfc}" /></td>

							<td style="text-align: center;"><c:out
									value="${account.masterName}" /></td>

							<td style="text-align: center;"><input type="button"
								id="beNo" name="beNo" value="선택"
								onclick="setBeNoText(${account.accountNo});" /></td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listAccount}">
					<tr>
						<td style="text-align: center;" colspan="5">목록이 존재하지 않습니다.</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	</div>
	<div style="align: center; width: 100px; height: 200; margin: auto;">
		<input type="button" id="button_ok" name="button_ok" value="닫기"
			onclick="closeWin();" />
	</div>
</body>
<script type="text/javascript">
	function setBeNoText(v) {
		console.log(v);
		opener.document.getElementById("accountNo").value = v;
		
		closeWin();
	}
	
	function closeWin() {
		window.close();
		self.close();
	}
</script>
</html>