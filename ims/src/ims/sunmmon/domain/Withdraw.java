package ims.sunmmon.domain;

import java.io.Serializable;

// 출금 
public class Withdraw implements Serializable {

    // 번호 
    private Integer withNo;

    // 출금일 
    private String withDate;

    // 거래처번호 
    private String clientNo;

    // 자사계정(계좌) 
    private String accountNo;

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

    public Integer getWithNo() {
        return withNo;
    }

    public void setWithNo(Integer withNo) {
        this.withNo = withNo;
    }

    public String getWithDate() {
        return withDate;
    }

    public void setWithDate(String withDate) {
        this.withDate = withDate;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
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

    // Withdraw 모델 복사
    public void CopyData(Withdraw param)
    {
        this.withNo = param.getWithNo();
        this.withDate = param.getWithDate();
        this.clientNo = param.getClientNo();
        this.accountNo = param.getAccountNo();
        this.conVer = param.getConVer();
        this.ammount = param.getAmmount();
        this.tax = param.getTax();
        this.useable = param.getUseable();
        this.note = param.getNote();
    }
}