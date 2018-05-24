package ims.sunmoon.util.option.find;

public enum AccountFindOption {
	NONE("-- 선택 --"), NO("계좌번호"), NAME("계좌명"), BANK_NAME("개설지/은행명"), CFC("구분명");

	private String text;

	private AccountFindOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
