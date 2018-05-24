package ims.sunmoon.util.option.find;

public enum TransferslipFindOption {
	NONE("-- 선택 --"), DEBTOR_NO("차변계좌번호"), CREDIT_NO("대변계좌번호"), DEBTOR_NAME("차변계좌명"), CREDIT_NAME("대변계좌명"), CON_VER(
			"적요");

	private String text;

	private TransferslipFindOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
