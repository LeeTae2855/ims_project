package ims.sunmmon.service.login;

import javax.servlet.http.HttpServletRequest;

import ims.sunmmon.domain.LoginInfo;

public interface LoginService {
	public LoginInfo login(HttpServletRequest request) throws Exception;
}
