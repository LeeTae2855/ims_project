package ims.sunmoon.util.option.sort;

public enum WWSortOption {
	// 번호, 입고번호, 출고번호, 거래완료일, 매입수량, 금액합계
	NONE("-- 선택 --"), NO("등록번호"), WARE_NO("입고 등록번호"), WITH_NO("출금 등록번호"), WW_DATE("거래완료일"), QUANTITY("매입수량"), AMMOUNT(
			"금액");

	private String text;

	private WWSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
