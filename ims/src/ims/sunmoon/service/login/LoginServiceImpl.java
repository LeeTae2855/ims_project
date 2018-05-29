package ims.sunmoon.service.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import ims.sunmoon.domain.LoginInfo;
import ims.sunmoon.persistance.LoginInfoMapper;

@Service
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginInfoMapper loginInfoMapper;
	
	@Override
	public LoginInfo login(HttpServletRequest request) throws Exception {
		LoginInfo loginInfo = new LoginInfo((String) request.getAttribute("id"), (String) request.getAttribute("password"));
		
		if (this.loginInfoMapper.select(loginInfo) == null) {
			return null;
		} else {
			return loginInfo;
		}
	}
}
