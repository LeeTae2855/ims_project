package ims.sunmoon.util.option.sort;

public enum ManagerSortOption {
	// 번호, 담당자명, 부서명
	NONE("-- 선택 --"), NO("등록번호"), NAME("담당자명"), DEP_NAME("부서명");

	private String text;

	private ManagerSortOption(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
