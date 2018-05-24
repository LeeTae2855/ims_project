package ims.sunmoon.util.option.sort;

public enum ClientSortOption {
	// 거래처번호, 거래처명, 상호명, 사업자번호, 업태, 종목
	NONE("-- 선택 --"), NO("등록번호"), CLEINT_NAME("거래처명"), COMP_NAME("상호명"), BSN_LIC_NO("사업자번호"), BSN_CDT("업태"), EVENT(
			"종목");

	private String text;

	private ClientSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
