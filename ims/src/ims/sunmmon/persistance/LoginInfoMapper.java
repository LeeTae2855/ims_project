package ims.sunmmon.persistance;

import ims.sunmmon.domain.LoginInfo;

public interface LoginInfoMapper {
	public LoginInfo select(LoginInfo loginInfo);

	public void update(LoginInfo loginInfo);
}
