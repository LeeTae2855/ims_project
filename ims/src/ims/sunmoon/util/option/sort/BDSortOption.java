package ims.sunmoon.util.option.sort;

public enum BDSortOption {
	// 번호, 출고번호, 입금번호, 거래완료일, 매출수량, 금액합계
	NONE("-- 선택 --"), NO("등록번호"), BE_NO("출고번호"), DEP_NO("입금번호"), BD_DATE("거래완료일"), QUANTITY("매출수량"), AMMOUNT("금액");

	private String text;

	private BDSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
