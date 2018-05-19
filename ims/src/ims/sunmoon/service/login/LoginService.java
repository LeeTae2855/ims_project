package ims.sunmoon.service.login;

import javax.servlet.http.HttpServletRequest;

import ims.sunmoon.domain.LoginInfo;

public interface LoginService {
	public LoginInfo login(HttpServletRequest request) throws Exception;
}
