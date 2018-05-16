package ims.sunmmon.domain;

import java.io.Serializable;
import java.sql.Date;

// 출고 
public class Bereleased implements Serializable {

    // 번호 
    private Integer beNo;

    // 품목 
    private String itemNo;

    // 출고예정일 
    private Date beDate;

    // 출고단위 
    private Integer unit;

    // 매출단가 
    private Integer price;

    // 할인금액 
    private Integer discount;

    // 적요 
    private String conVer;

    // 사용(조회)가능여부 
    private Integer useable;

    public Integer getBeNo() {
        return beNo;
    }

    public void setBeNo(Integer beNo) {
        this.beNo = beNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Date getBeDate() {
        return beDate;
    }

    public void setBeDate(Date beDate) {
        this.beDate = beDate;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getConVer() {
        return conVer;
    }

    public void setConVer(String conVer) {
        this.conVer = conVer;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    // Bereleased 모델 복사
    public void CopyData(Bereleased param)
    {
        this.beNo = param.getBeNo();
        this.itemNo = param.getItemNo();
        this.beDate = param.getBeDate();
        this.unit = param.getUnit();
        this.price = param.getPrice();
        this.discount = param.getDiscount();
        this.conVer = param.getConVer();
        this.useable = param.getUseable();
    }
}