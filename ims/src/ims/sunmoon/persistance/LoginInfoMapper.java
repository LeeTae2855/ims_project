package ims.sunmoon.persistance;

import ims.sunmoon.domain.LoginInfo;

public interface LoginInfoMapper {
	public LoginInfo select(LoginInfo loginInfo);

	public void update(LoginInfo loginInfo);
}
