package ims.sunmoon.util.option.sort;

public enum WithdrawSortOption {
	// 번호, 출금일, 거래처번호, 금액, 세액
	NONE("-- 선택 --"), NO("등록번호"), WITH_DATE("출금일"), CLIENT_NO("거래처 등록번호"), AMMOUNT("출금액"), TAX("세액");

	private String text;

	private WithdrawSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
