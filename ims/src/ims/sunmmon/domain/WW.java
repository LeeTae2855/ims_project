package ims.sunmmon.domain;

import java.io.Serializable;
import java.sql.Date;

// 입고/출금 
public class WW implements Serializable {

    // 번호 
    private Integer wwNo;

    // 입고번호 
    private Integer wareNo;

    // 출금번호 
    private Integer withNo;

    // 거래완료일 
    private Date wwDate;

    // 매입수량 
    private Integer quantity;

    // 금액합계 
    private Integer ammount;

    // 사용(조회)가능여부 
    private Integer useable;

    // 적요 
    private String conVer;

    // 비고 
    private String note;

    public Integer getWwNo() {
        return wwNo;
    }

    public void setWwNo(Integer wwNo) {
        this.wwNo = wwNo;
    }

    public Integer getWareNo() {
        return wareNo;
    }

    public void setWareNo(Integer wareNo) {
        this.wareNo = wareNo;
    }

    public Integer getWithNo() {
        return withNo;
    }

    public void setWithNo(Integer withNo) {
        this.withNo = withNo;
    }

    public Date getWwDate() {
        return wwDate;
    }

    public void setWwDate(Date wwDate) {
        this.wwDate = wwDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    public String getConVer() {
        return conVer;
    }

    public void setConVer(String conVer) {
        this.conVer = conVer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Ww 모델 복사
    public void CopyData(WW param)
    {
        this.wwNo = param.getWwNo();
        this.wareNo = param.getWareNo();
        this.withNo = param.getWithNo();
        this.wwDate = param.getWwDate();
        this.quantity = param.getQuantity();
        this.ammount = param.getAmmount();
        this.useable = param.getUseable();
        this.conVer = param.getConVer();
        this.note = param.getNote();
    }
}