package ims.sunmoon.util.cfc;

public enum AccountCFC {
	// 매입, 매출, 장부
	PURCHASE("매입"), SALES("매출"), BOOK("장부");

	private String text;

	private AccountCFC(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
