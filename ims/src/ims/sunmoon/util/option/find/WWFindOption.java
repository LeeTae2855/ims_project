package ims.sunmoon.util.option.find;

public enum WWFindOption {
	NONE("-- 선택 --"), ITEM_CODE("제품코드"), ITEM_NAME("제품명"), CLIENT_NAME("거래처명"), CON_VER("적요");

	private String text;

	private WWFindOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
