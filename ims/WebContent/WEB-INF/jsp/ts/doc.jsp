<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>::: 대 체 전 표 :::</title>
</head>
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg .tg-rbd8{border-color:#3166ff;text-align:center;vertical-align:bottom}
.tg .tg-g0yt{font-weight:bold;color:#3166ff;border-color:#3166ff;text-align:center;vertical-align:top}
.tg .tg-bidy{border-color:#3166ff;text-align:center;vertical-align:top}
</style>
<style type="text/css">
.tg  {border-collapse:collapse;}
.tg td{font-family:Arial, sans-serif;font-size:14px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg .tg-r7b4{font-weight:bold;font-family:"Arial Black", Gadget, sans-serif !important;;background-color:#efefef;color:#3166ff;border-color:#3166ff;text-align:center}
.tg .tg-lmft{font-weight:bold;font-family:"Arial Black", Gadget, sans-serif !important;;color:#3166ff;border-color:#3166ff;text-align:center}
.tg .tg-ip6l{font-family:"Arial Black", Gadget, sans-serif !important;;border-color:#3166ff;text-align:center;}
.tg .tg-wjub{font-family:"Arial Black", Gadget, sans-serif !important;;background-color:#d4eaeb;border-color:#3166ff;text-align:center;}
.tg .tg-c4ow{font-family:"Arial Black", Gadget, sans-serif !important;;background-color:#ffccc9;border-color:#3166ff;text-align:center;}
.tg .tg-1wxf{font-family:"Arial Black", Gadget, sans-serif !important;;background-color:#efefef;border-color:#3166ff;text-align:center;}
</style>
<body>
<h1 align='center'>
<font style='text-align:center;font-weight:bold;' color='#3166ff'>[&nbsp;&nbsp;대&nbsp;&nbsp;체&nbsp;&nbsp;거&nbsp;&nbsp;래&nbsp;&nbsp;]&nbsp;&nbsp;전&nbsp;&nbsp;표</font>
</h1>
<table class="tg" style="undefined;table-layout: fixed; width: 296px">
<colgroup>
<col style="width: 38px">
<col style="width: 53px">
<col style="width: 53px">
<col style="width: 53px">
<col style="width: 50px">
<col style="width: 49px">
</colgroup>
  <tr>
    <th class="tg-g0yt" rowspan="2">결<br><br><br>재</th>
    <th class="tg-bidy"></th>
    <th class="tg-bidy"></th>
    <th class="tg-bidy"></th>
    <th class="tg-bidy"></th>
    <th class="tg-bidy"></th>
  </tr>
  <tr>
    <td class="tg-rbd8"></td>
    <td class="tg-rbd8"></td>
    <td class="tg-rbd8"></td>
    <td class="tg-rbd8"></td>
    <td class="tg-rbd8"></td>
  </tr>
</table>
<br/><br/>
<table class="tg" style="undefined;table-layout: fixed; width: 836px">
<colgroup>
<col style="width: 154px">
<col style="width: 350px">
<col style="width: 166px">
<col style="width: 166px">
</colgroup>
  <tr>
    <th class="tg-lmft">&nbsp;&nbsp;&nbsp;&nbsp;계&nbsp;&nbsp;정&nbsp;&nbsp;과&nbsp;&nbsp;목&nbsp;&nbsp;&nbsp;&nbsp;</th>
    <th class="tg-lmft">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;적&nbsp;&nbsp;&nbsp;&nbsp;요&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
    <th class="tg-lmft">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;차&nbsp;&nbsp;&nbsp;변&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
    <th class="tg-lmft">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;대&nbsp;&nbsp;&nbsp;변&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
  </tr>
  <tr>
    <td class="tg-ip6l"><c:out value="${doc.account.accountCfc}" /></td>
    <td class="tg-ip6l"><c:out value="${doc.ts.conVer}" /></td>
    <td class="tg-c4ow"><c:out value="${doc.ts.debtorAmmount}" /></td>
    <td class="tg-wjub"><c:out value="${doc.ts.creditAmmount}" /></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-ip6l"></td>
    <td class="tg-ip6l"></td>
    <td class="tg-c4ow"></td>
    <td class="tg-wjub"></td>
  </tr>
  <tr>
    <td class="tg-r7b4">합&nbsp;&nbsp;&nbsp;계</td>
    <td class="tg-1wxf">-</td>
    <td class="tg-1wxf"><c:out value="${doc.ts.debtorAmmount}" /></td>
    <td class="tg-1wxf"><c:out value="${doc.ts.creditAmmount}" /></td>
  </tr>
</table>
</body>
</html>