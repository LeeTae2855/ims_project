package ims.sunmoon.util.option.find;

public enum WithdrawFindOption {
	NONE("-- 선택 --"), WITH_NO("출금번호"), CLEINT_NO("거래처 등록번호"), CLIENT_NAME("거래처명"), CON_VER("적요");
	
	private String text;
	
	private WithdrawFindOption(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}
