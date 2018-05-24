package ims.sunmoon.util.option.sort;

public enum BereleasedSortOption {
	// 번호, 품목번호, 출고예정일, 출고단위, 매출단가, 할인금액
	NONE("-- 선택 --"), BE_NO("등록번호"), ITEM_NO("품목코드"), BE_DATE("출고예정일"), UNIT("출고단위"), PRICE("매출단가"), DISCOUNT("할인금액");

	private String text;

	private BereleasedSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
