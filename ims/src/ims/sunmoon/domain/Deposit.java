package ims.sunmoon.domain;

import java.io.Serializable;
import java.sql.Date;

import ims.sunmoon.util.option.sort.DepositSortOption;

// 입금 
public class Deposit implements Serializable {

    // 번호 
    private Integer depNo;

    // 입금일 
    private Date depDate;

    // 거래처번호 
    private Integer clientNo;

    // 자사계정(계좌) 
    private Integer accountNo;

    // 적요 
    private String conVer;

    // 금액 
    private Integer ammount;

    // 세액 
    private Integer tax;

    // 사용(조회)가능여부 
    private Integer useable;

    // 비고 
    private String note;
    
    private DepositSortOption depositSortOption;
    private Date first;
    private Date last;

    public Integer getDepNo() {
        return depNo;
    }

    public void setDepNo(Integer depNo) {
        this.depNo = depNo;
    }

    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    public Integer getClientNo() {
        return clientNo;
    }

    public void setClientNo(Integer clientNo) {
        this.clientNo = clientNo;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getConVer() {
        return conVer;
    }

    public void setConVer(String conVer) {
        this.conVer = conVer;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
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

    public DepositSortOption getDepositSortOption() {
		return depositSortOption;
	}

	public void setDepositSortOption(DepositSortOption depositSortOption) {
		this.depositSortOption = depositSortOption;
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

	// Deposit 모델 복사
    public void CopyData(Deposit param)
    {
        this.depNo = param.getDepNo();
        this.depDate = param.getDepDate();
        this.clientNo = param.getClientNo();
        this.accountNo = param.getAccountNo();
        this.conVer = param.getConVer();
        this.ammount = param.getAmmount();
        this.tax = param.getTax();
        this.useable = param.getUseable();
        this.note = param.getNote();
        this.depositSortOption = param.getDepositSortOption();
        this.first = param.getFirst();
        this.last = param.getLast();
    }
}