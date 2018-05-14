package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.LoginInfo;

public interface LoginInfoMapper {
	List<LoginInfo> list(LoginInfo loginInfo);

	void insert(LoginInfo loginInfo);

	LoginInfo select(LoginInfo loginInfo);

	void update(LoginInfo loginInfo);

	void delete(String id);
}
