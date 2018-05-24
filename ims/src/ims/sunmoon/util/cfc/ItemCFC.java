package ims.sunmoon.util.cfc;

public enum ItemCFC {
	// 상품, 제품, 부품, 반제품, 세트
	GOODS("상품"), PRODUCT("제품"), PART("부품"), SEMI("반제품"), SET("세트");

	private String text;

	private ItemCFC(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
