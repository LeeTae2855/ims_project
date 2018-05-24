package ims.sunmoon.domain;

import java.io.Serializable;
import java.sql.Date;

import ims.sunmoon.util.option.find.TransferslipFindOption;
import ims.sunmoon.util.option.sort.TransferslipSortOption;

// 대체거래 
public class Transferslip implements Serializable {
	private static final long serialVersionUID = -5947602189668879720L;

	// 번호
	private Integer tsNo;

	// 거래일
	private Date tsDate;

	// 거래처번호
	private Integer clientNo;

	// 적요
	private String conVer;

	// 차변계정
	private Integer debtorNo;

	// 차변금액
	private Integer debtorAmmount;

	// 대변계정
	private Integer creditNo;

	// 대변금액
	private Integer creditAmmount;

	// 사용(조회)가능여부
	private Integer useable;

	// 비고
	private String note;

	private TransferslipSortOption transferslipSortOption;
	private Date first;
	private Date last;
	private String keyword;
	private TransferslipFindOption findOption;
	private String creditName;
	private String debtorName;

	public Transferslip() {
	}

	public Transferslip(Integer tsNo, Date tsDate, Integer clientNo, String conVer, Integer debtorNo,
			Integer debtorAmmount, Integer creditNo, Integer creditAmmount, Integer useable, String note,
			TransferslipSortOption transferslipSortOption, Date first, Date last, String keyword,
			TransferslipFindOption findOption, String creditName, String debtorName) {
		this.tsNo = tsNo;
		this.tsDate = tsDate;
		this.clientNo = clientNo;
		this.conVer = conVer;
		this.debtorNo = debtorNo;
		this.debtorAmmount = debtorAmmount;
		this.creditNo = creditNo;
		this.creditAmmount = creditAmmount;
		this.useable = useable;
		this.note = note;
		this.transferslipSortOption = transferslipSortOption;
		this.first = first;
		this.last = last;
		this.keyword = keyword;
		this.findOption = findOption;
		this.creditName = creditName;
		this.debtorName = debtorName;
	}

	public Integer getTsNo() {
		return tsNo;
	}

	public void setTsNo(Integer tsNo) {
		this.tsNo = tsNo;
	}

	public Date getTsDate() {
		return tsDate;
	}

	public void setTsDate(Date tsDate) {
		this.tsDate = tsDate;
	}

	public Integer getClientNo() {
		return clientNo;
	}

	public void setClientNo(Integer clientNo) {
		this.clientNo = clientNo;
	}

	public String getConVer() {
		return conVer;
	}

	public void setConVer(String conVer) {
		this.conVer = conVer;
	}

	public Integer getDebtorNo() {
		return debtorNo;
	}

	public void setDebtorNo(Integer debtorNo) {
		this.debtorNo = debtorNo;
	}

	public Integer getDebtorAmmount() {
		return debtorAmmount;
	}

	public void setDebtorAmmount(Integer debtorAmmount) {
		this.debtorAmmount = debtorAmmount;
	}

	public Integer getCreditNo() {
		return creditNo;
	}

	public void setCreditNo(Integer creditNo) {
		this.creditNo = creditNo;
	}

	public Integer getCreditAmmount() {
		return creditAmmount;
	}

	public void setCreditAmmount(Integer creditAmmount) {
		this.creditAmmount = creditAmmount;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setUseable(Integer useable) {
		this.useable = useable;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public TransferslipSortOption getTransferslipSortOption() {
		return transferslipSortOption;
	}

	public void setTransferslipSortOption(TransferslipSortOption transferslipSortOption) {
		this.transferslipSortOption = transferslipSortOption;
	}

	public Date getFirst() {
		return first;
	}

	public void setFirst(Date first) {
		this.first = first;
	}

	public Date getLast() {
		return last;
	}

	public void setLast(Date last) {
		this.last = last;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public TransferslipFindOption getFindOption() {
		return findOption;
	}

	public void setFindOption(TransferslipFindOption findOption) {
		this.findOption = findOption;
	}

	public String getCreditName() {
		return creditName;
	}

	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	// Transferslip 모델 복사
	public void CopyData(Transferslip param) {
		this.tsNo = param.getTsNo();
		this.tsDate = param.getTsDate();
		this.clientNo = param.getClientNo();
		this.conVer = param.getConVer();
		this.debtorNo = param.getDebtorNo();
		this.debtorAmmount = param.getDebtorAmmount();
		this.creditNo = param.getCreditNo();
		this.creditAmmount = param.getCreditAmmount();
		this.useable = param.getUseable();
		this.note = param.getNote();
		this.transferslipSortOption = param.getTransferslipSortOption();
		this.first = param.getFirst();
		this.last = param.getLast();
		this.keyword = param.getKeyword();
		this.findOption = param.getFindOption();
		this.creditName = param.getCreditName();
		this.debtorName = param.getDebtorName();
	}
}