package ims.sunmoon.util.option.find;

public enum ClientFindOption {
	NONE("-- 선택 --"), NO("등록번호"), NAME("거래처명");

	private String text;

	private ClientFindOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
