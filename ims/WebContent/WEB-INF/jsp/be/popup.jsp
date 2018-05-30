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
		<form action="/be/popup" method="post">
			<table style="border_color: white; align: center;">
				<tr>
					<td><select id="findOption" name="findOption">
							<option value='NONE' selected>-- 선택 --</option>
							<option value='ITEM_NAME'>재고명</option>
							<option value='CON_VER'>적요</option>
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
					<th>제품명</th>
					<th>출고 예정일</th>
					<th>출고단위</th>
					<th>매출단가</th>
					<th>할인금액</th>
					<th>적요</th>
					<th>등록</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty listBe}">
					<c:forEach items="${listBe}" var="be" varStatus="status">
						<tr>
							<td style="text-align: center;"><c:out
									value="${be.beNo}" /></td>
							<td style="text-align: center;"><c:out value="${be.itemName}" /></td>

							<td style="text-align: center;"><fmt:formatDate
											value="${be.beDate}" pattern="yyyy-MM-dd" /></td>
											
							<td style="text-align: center;"><c:out value="${be.unit}" /></td>

							<td style="text-align: center;"><c:out value="${be.price}" /></td>
							
							<td style="text-align: center;"><c:out value="${be.discount}" /></td>
							
							<td style="text-align: center;"><c:out value="${be.conVer}" /></td>

							<td style="text-align: center;"><input type="button"
								id="beNo" name="beNo" value="선택"
								onclick="setBeNoText(${be.beNo});" /></td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listBe}">
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
		opener.document.getElementById("beNo").value = v;
		
		closeWin();
	}
	
	function closeWin() {
		window.close();
		self.close();
	}
</script>
</html>