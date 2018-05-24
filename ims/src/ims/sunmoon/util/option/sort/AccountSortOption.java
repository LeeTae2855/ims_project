package ims.sunmoon.util.option.sort;

public enum AccountSortOption {
	// 계좌번호, 계정명, 은행명
	NONE("-- 선택 --"), NO("계좌번호"), NAME("계좌명"), BANK_NAME("개설지/은행명"), CFC("구분명");
	
	private String text;

	private AccountSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
