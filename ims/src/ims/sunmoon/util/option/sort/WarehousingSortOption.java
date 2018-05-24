package ims.sunmoon.util.option.sort;

public enum WarehousingSortOption {
	// 번호, 품목, 입고예정일, 입고단위, 매입단가, 할인금액
	NONE("-- 선택 --"), WARE_NO("등록번호"), ITEM_NO("제품코드"), WARE_DATE("입고예정일"), UNIT("입고단위"), PRICE("매입단가"), DISCOUNT(
			"할인금액");

	private String text;

	private WarehousingSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
