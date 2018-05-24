package ims.sunmoon.util.option.find;

public enum ManagerFindOption {
	NONE("-- 선택 --"), NO("등록번호"), NAME("담당자명");

	private String text;

	private ManagerFindOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
