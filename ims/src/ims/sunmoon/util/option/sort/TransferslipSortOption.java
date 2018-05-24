package ims.sunmoon.util.option.sort;

public enum TransferslipSortOption {
	// 번호, 거래일, 거래처번호, 차변계정, 차변금액, 대변계정, 대변금액
	NONE("-- 선택 --"), NO("등록번호"), TS_DATE("거래일"), CLIENT_NO("거래처 등록번호"), DEBTOR_NO("차변계좌번호"), DEBTOR_AMMOUNT(
			"차변금액"), CREDIT_NO("대변계좌번호"), CREDIT_AMMOUNT("대변금액");

	private String text;

	private TransferslipSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
