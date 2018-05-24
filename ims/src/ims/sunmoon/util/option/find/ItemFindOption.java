package ims.sunmoon.util.option.find;

public enum ItemFindOption {
	NONE("-- 선택 --"), ITEM_CODE("제품코드"), ITEM_NAME("제품명"), ITEM_CFC("구분명"), ITEM_STATUS("재고상태");

	private String text;

	private ItemFindOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
