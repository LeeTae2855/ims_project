package ims.sunmoon.util.option.sort;

public enum ItemSortOption {
	// 품목코드, 품목구분, 품목명, 규격/별칭, 재고상태
	NONE("-- 선택 --"), ITEM_CODE("제품코드"), ITEM_CFC("구분명"), ITEM_NAME("제품명"), STANDARD("규격/별칭"), STATUS("제품상태");

	private String text;

	private ItemSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
