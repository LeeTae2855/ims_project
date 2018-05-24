package ims.sunmoon.domain;

import java.io.Serializable;
import java.sql.Date;

import ims.sunmoon.util.option.find.BereleasedFindOption;
import ims.sunmoon.util.option.sort.BereleasedSortOption;

// 출고 
public class Bereleased implements Serializable {
	private static final long serialVersionUID = -2885921527723339404L;

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

	private BereleasedSortOption bereleasedSortOption;
	private Date first;
	private Date last;
	private BereleasedFindOption findOption;

	public Bereleased() {
	}

	public Bereleased(Integer beNo, String itemNo, Date beDate, Integer unit, Integer price, Integer discount,
			String conVer, Integer useable, BereleasedSortOption bereleasedSortOption, Date first, Date last,
			BereleasedFindOption findOption) {
		this.beNo = beNo;
		this.itemNo = itemNo;
		this.beDate = beDate;
		this.unit = unit;
		this.price = price;
		this.discount = discount;
		this.conVer = conVer;
		this.useable = useable;
		this.bereleasedSortOption = bereleasedSortOption;
		this.first = first;
		this.last = last;
		this.findOption = findOption;
	}

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

	public BereleasedSortOption getBereleasedSortOption() {
		return bereleasedSortOption;
	}

	public void setBereleasedSortOption(BereleasedSortOption bereleasedSortOption) {
		this.bereleasedSortOption = bereleasedSortOption;
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

	public BereleasedFindOption getFindOption() {
		return findOption;
	}

	public void setFindOption(BereleasedFindOption findOption) {
		this.findOption = findOption;
	}

	// Bereleased 모델 복사
	public void CopyData(Bereleased param) {
		this.beNo = param.getBeNo();
		this.itemNo = param.getItemNo();
		this.beDate = param.getBeDate();
		this.unit = param.getUnit();
		this.price = param.getPrice();
		this.discount = param.getDiscount();
		this.conVer = param.getConVer();
		this.useable = param.getUseable();
		this.bereleasedSortOption = param.bereleasedSortOption;
		this.first = param.getFirst();
		this.last = param.getLast();
		this.findOption = param.getFindOption();
	}
}