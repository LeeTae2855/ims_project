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
		<form action="/client/popup" method="post">
			<table style="border_color: white; align: center;">
				<tr>
					<td><select id="findOption" name="findOption">
							<option value='NONE' selected>-- 선택 --</option>
							<option value='NO'>등록번호</option>
							<option value='NAME'>거래처명</option>
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
					<th>등록번호</th>
					<th>거래처명</th>
					<th>대표자</th>
					<th>등록</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listClient}">
					<c:forEach items="${listClient}" var="client" varStatus="status">
						<tr>
							<td style="text-align: center;"><c:out
									value="${client.clientNo}" /></td>

							<td style="text-align: center;"><c:out
									value="${client.clientName}" /></td>

							<td style="text-align: center;"><c:out value="${client.rep}" /></td>

							<td style="text-align: center;"><input type="button"
								id="beNo" name="beNo" value="선택"
								onclick="setBeNoText(${client.clientNo});" /></td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listClient}">
					<tr>
						<td style="text-align: center;" colspan="4">목록이 존재하지 않습니다.</td>
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
		opener.document.getElementById("clientNo").value = v;
		
		closeWin();
	}
	
	function closeWin() {
		window.close();
		self.close();
	}
</script>
</html>