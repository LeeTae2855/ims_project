package ims.sunmoon.util.option.status;

public enum ItemStatus {
	// 재고, 분실, 폐기
	STOCK("재고"), LOSS("분실"), DISPOSAL("폐기");

	private String text;

	private ItemStatus(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
