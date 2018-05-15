package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.LoginInfo;

public interface LoginInfoMapper {
	public List<LoginInfo> list(LoginInfo loginInfo);

	public void insert(LoginInfo loginInfo);

	public LoginInfo select(LoginInfo loginInfo);

	public void update(LoginInfo loginInfo);

	public void delete(String id);
}
