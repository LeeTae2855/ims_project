<%@page import="ims.sunmoon.domain.Client"%>
<%@page import="ims.sunmoon.domain.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- HTMLHEAD -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>발주서</title>
</head>
<body style="padding:0px; margin:0 auto; font-family:'Nanum Gothic', serif; font-size:12px;">
<%
%>
<table style="width:900px; margin:0 auto;" cellpadding="0" cellspacing="0">
    <tr>
	    <td style="text-align:center; font-size:35px; font-weight:bold; padding-top:30px; padding-bottom:25px;">발 주 서</td>
    </tr>
        <tr>
	    <td>
        	<table cellpadding="0" cellspacing="0" style="font-size:9pt">
            	<tr>
                	<td width="500" valign="top">
                    	<table style="border-top:1px solid #000; border-left:1px solid #000; width:100%;" cellpadding="0" cellspacing="0">
                        <colgroup>
                        	<col width="30%" />
                            <col />
                        </colgroup>
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px">업체명<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Messieurs</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.client.clientName}" /></td>
                            </tr>
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px">수&nbsp;&nbsp;&nbsp;신<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Attention</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px">OK</td>
                            </tr>
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px">전&nbsp;&nbsp;&nbsp;화<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Tel/Fax</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.client.repPhone}" /> / <c:out value="${doc.client.repFax}" /></td>
                            </tr>
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px">제&nbsp;&nbsp;&nbsp;목<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Subject</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px">발&nbsp;&nbsp;주</td>
                            </tr>
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px">발주번호<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Order No.</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.bd.bdNo}" /></td>
                            </tr>
                        </table>
                    </td>
                    <td width="10"></td>
                    <td width="400" valign="top">
                    	<table style="width:100%;" cellpadding="0" cellspacing="0">
                        <colgroup>
                        	<col width="20%" />
                            <col />
                            <col width="80" />
                        </colgroup>
                            <tr>
                                <th style="background-color:#ddd; padding:10px 5px; text-align:left; font-size:15px; font-family:'Nanum Gothic', serif;" colspan="3"><c:out value="${doc.client.clientNo}" /></th>
                            </tr>
                            <tr>
                                <td style="padding:7px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">상&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;호 </td>
                                <td style="padding:7px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.client.compName}" /></td>
                                <td rowspan="2" style="padding:7px 5px; text-align:right;"><img src=cid:StampGif width="40" height="40"  /></td>
                            </tr>
                            <tr>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">대 표 자 </td>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.client.rep}" /></td>
                            </tr>
                            <tr>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">담 당 자 </td>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.manager.managerName}" /></td>
                            </tr>
                            <tr>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">거 래 처 주 소 </td>
                                <td colspan="2" style="padding:5px 5px; text-align:left; table-layout:fixed; word-break:break-all;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.client.bsnEstAddr}" /></td>
                            </tr>
                            <tr>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">담 당 자 Tel/Fax </td>
                                <td colspan="2" style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.manager.telephone}" /> / <c:out value="${doc.manager.fax}" /></td>
                            </tr>
                            <tr>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">거 래 처 E- mail </td>
                                <td colspan="2" style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.client.email}" /></td>
                            </tr>
                            <tr>
                                <td style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px">발주일자 </td>
                                <td colspan="2" style="padding:5px 5px; text-align:left;font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.bd.bdDate}" /></td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
	    <td style="padding-bottom:10px; padding-top:10px;">
        	<table cellpadding="0" cellspacing="0" style="width:100% ; border-top:2px solid #000;font-size:9pt; border-left:1px solid #000; border-bottom:1px solid #000; height:60px; table-layout:fixed; ">
            	<tr>
                	<th style="width:100px; font-family:'Nanum Gothic', serif; font-size:12px; height:60px;">합 계<br /><span style="font-size:7pt; font-family:Verdana; font-weight:normal; ">Total</span></th>
                  <td style="width:350px ; border-left:1px solid #000; padding:0 5px;font-family:'Nanum Gothic', serif; font-size:12px">&nbsp;<c:out value="${doc.bd.ammount}" /></td>
                  <th style="width:100px ; border-left:1px solid #000;font-family:'Nanum Gothic', serif; font-size:12px">담당자<br /><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Contact</span></th>
                  <td style="width:150px ; border-left:1px solid #000; border-right:1px solid #000; padding:0 5px;font-family:'Nanum Gothic', serif; font-size:12px ">&nbsp;&nbsp;<c:out value="${doc.manager.managerName}" /></td>
                </tr>
            </table>
        </td>
     
    </tr>
    <tr>
	    <td>
<!-- HTMLHEAD1 -->
	        <table style="border-top:1px solid #000; border-left:1px solid #000; width:100%;font-size:9pt; " cellpadding="0" cellspacing="0">
            <colgroup>
            	<col width="5%" />
                <col width="26%"/>
                <col width="12%" />
                <col width="5%" />
                <col width="9%" />
                <col width="14%" />
                <col width="15%" />
                <col width="14%" />
            </colgroup>
            	
<!-- HTMLHEAD2 -->
	        <table style="border-top:1px solid #000; border-left:1px solid #000; width:100%;font-size:9pt;" cellpadding="0" cellspacing="0">
            <colgroup>
            	<col width="5%" />
                <col width="36%"/>
                <col width="6%" />
                <col width="10%" />
                <col width="14%" />
                <col width="15%" />
                <col width="14%" />
            </colgroup>
            	<tr>
                	<th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px; table-layout:fixed; word-break:break-all;">번호<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">No</span></th>
                    <th colspan="2" style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px;table-layout:fixed; word-break:break-all;">품목 / 규격<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Product Description - Specfication</span></th>
                    <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px;table-layout:fixed; word-break:break-all;">단위<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Unit</span></th>
                    <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px;table-layout:fixed; word-break:break-all;">수량<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Qty</span></th>
                    <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px;table-layout:fixed; word-break:break-all;">단가<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Price</span></th>
                    <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px;table-layout:fixed; word-break:break-all;">공급가액<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Amount</span></th>
                    <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px;table-layout:fixed; word-break:break-all;">&nbsp;세&nbsp;액&nbsp;<br/><span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Tax</span></th>
                </tr>
<!-- HTMLBODY2 -->
                <tr>
                	<td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:center; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.be.beNo}" /></td>
                    <td colspan="2" style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:left; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.item.standard}" /></td>
                    <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:center; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.be.unit}" /></td>
                    <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:center; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.bd.quantity}" /></td>
                    <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:right; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.be.price}" /></td>
                    <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:right; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.dep.ammount}" /></td>
                    <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:2px 2px; height:30px; text-align:right; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.dep.tax}" /></td>
                </tr>
<!-- HTMLTAIL -->
    	    </table>
        </td>
    </tr>
    
    <tbody>
      <tr>
       <td style="padding-top:1px;">
      </tr>

	    <td>
        	<table cellpadding="0" cellspacing="0" style="font-size:9pt">
            	<tr>
                	<td width="450" valign="top">
                    	<table style="border-top:1px solid #000; border-left:1px solid #000; width:100%;" cellpadding="0" cellspacing="0">
                        <!--<colgroup>
                        	<col width="100px" />
                          <col width="70%" />
                        </colgroup>-->
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px; width:150px"  align="center">납기일자<br/>
                                <span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Delivery Date</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px">&nbsp;<c:out value="${doc.be.beDate}" /></td>
                            </tr>
                            <tr>
                                <th style="background-color:#eaeaea; border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 0px; font-family:'Nanum Gothic', serif; font-size:12px; width:150px"  align="center">적요<br/>
                                <span style="font-size:7pt; font-family:Verdana; font-weight:normal;">Delivery Date</span></th>
                                <td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:7px 5px; text-align:left; height:16px;font-family:'Nanum Gothic', serif; font-size:12px">&nbsp;<c:out value="${doc.bd.conVer}" /></td>
                            </tr>
                    </td>
                    <td width="1"></td>
                    <td width="450" valign="top">

                    </td>
                </tr>
            </table>
        </td>
    </tr>
    
    <tr>
     <td style="padding-top:1px;">
    </tr>
    
    <tr>
	    <td>
        	<table cellpadding="0" cellspacing="0" style="font-size:9pt">
            	<tr>
                	<td width="349" valign="top">
                    	<table width="80%" cellpadding="0" cellspacing="0" style="border-top:1px solid #000; border-left:1px solid #000; width:100%;">
                        <colgroup>
                        	<col width="30%" />
                          <col width="70%"/>
                            <col />
                        </colgroup>
                           
                        </table>
                    </td>
                </tr>
                
 <tr>
	    <td></td>
    </tr>    
    </tbody>
    <tr>
    	<td style="padding-top:2px;">
        	<table style="border-top:1px solid #000; border-left:1px solid #000; width:900px;" cellpadding="0" cellspacing="0">
                <tr>
                	<td style="border-bottom:1px solid #000; border-right:1px solid #000; padding:0 7px; text-align:left; height:100px; table-layout:fixed; word-break:break-all; font-family:'Nanum Gothic', serif; font-size:12px"><c:out value="${doc.bd.note}" /></td>
                </tr>
            </table>
        </td>
    </tr>
</body>
</html>
