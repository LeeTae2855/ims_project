package ims.sunmoon.util.option.sort;

public enum DepositSortOption {
	// 번호, 입금일, 거래처번호, 금액, 세액
	NONE("-- 선택 --"), DEP_NO("등록번호"), DEP_DATE("입금일"), CLEINT_NO("거래처번호"), AMMOUNT("입금액"), TAX("세액");

	private String text;

	private DepositSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
