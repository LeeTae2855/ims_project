package ims.sunmoon.domain;

import java.io.Serializable;

import ims.sunmoon.util.option.find.ItemFindOption;
import ims.sunmoon.util.option.sort.ItemSortOption;
import ims.sunmoon.util.option.status.ItemStatus;
import ims.sunmoon.util.cfc.ItemCFC;

// 품목(재고) 
public class Item implements Serializable {
	private static final long serialVersionUID = 4753338407070233273L;

	// 품목코드
	private String itemCode;

	// 품목구분 (상품, 제품, 부품, 반제품, 세트)
	private Integer itemCfc;

	// 품목명
	private String itemName;

	// 규격/별칭
	private String standard;

	// 기초재고량
	private Integer baseQuantity;

	// 재고상태
	private String itemStatus;

	// 사용(조회)가능여부
	private Integer useable;

	// 비고
	private String note;

	private ItemSortOption itemSortOption;
	private ItemCFC itemCfcOption;
	private ItemStatus itemStatusOption;
	private ItemFindOption findOption;
	private String keyword;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getItemCfc() {
		return itemCfc;
	}

	public void setItemCfc(Integer itemCfc) {
		this.itemCfc = itemCfc;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Integer getBaseQuantity() {
		return baseQuantity;
	}

	public void setBaseQuantity(Integer baseQuantity) {
		this.baseQuantity = baseQuantity;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
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

	public ItemSortOption getItemSortOption() {
		return itemSortOption;
	}

	public void setItemSortOption(ItemSortOption itemSortOption) {
		this.itemSortOption = itemSortOption;
	}

	public ItemCFC getItemCfcOption() {
		return itemCfcOption;
	}

	public void setItemCfcOption(ItemCFC itemCfcOption) {
		this.itemCfcOption = itemCfcOption;
	}

	public ItemStatus getItemStatusOption() {
		return itemStatusOption;
	}

	public void setItemStatusOption(ItemStatus itemStatusOption) {
		this.itemStatusOption = itemStatusOption;
	}

	public ItemFindOption getFindOption() {
		return findOption;
	}

	public void setFindOption(ItemFindOption findOption) {
		this.findOption = findOption;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	// Item 모델 복사
	public void CopyData(Item param) {
		this.itemCode = param.getItemCode();
		this.itemCfc = param.getItemCfc();
		this.itemName = param.getItemName();
		this.standard = param.getStandard();
		this.baseQuantity = param.getBaseQuantity();
		this.itemStatus = param.getItemStatus();
		this.useable = param.getUseable();
		this.note = param.getNote();
		this.itemSortOption = param.getItemSortOption();
		this.itemCfcOption = param.getItemCfcOption();
		this.itemStatusOption = param.getItemStatusOption();
		this.findOption = param.getFindOption();
		this.keyword = param.getKeyword();
	}
}