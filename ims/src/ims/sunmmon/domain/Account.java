package ims.sunmmon.domain;

import java.io.Serializable;

// 계좌(계정 및 장부) 
public class Account implements Serializable {

    // 계좌번호 
    private Integer accountNo;

    // 계정명 
    private String accountName;

    // 계정구분(매입/매출/장부) 
    private String accountCfc;

    // 예금주 
    private String masterName;

    // 휴대전화 
    private Integer cellphone;

    // 은행명/개설지 
    private String bankName;

    // 자사계정여부 
    private Integer isowner;

    // 사용(조회)가능여부 
    private Integer useable;

    // 비고 
    private String note;

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountCfc() {
        return accountCfc;
    }

    public void setAccountCfc(String accountCfc) {
        this.accountCfc = accountCfc;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getIsowner() {
        return isowner;
    }

    public void setIsowner(Integer isowner) {
        this.isowner = isowner;
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

    // Account 모델 복사
    public void CopyData(Account param)
    {
        this.accountNo = param.getAccountNo();
        this.accountName = param.getAccountName();
        this.accountCfc = param.getAccountCfc();
        this.masterName = param.getMasterName();
        this.cellphone = param.getCellphone();
        this.bankName = param.getBankName();
        this.isowner = param.getIsowner();
        this.useable = param.getUseable();
        this.note = param.getNote();
    }
}