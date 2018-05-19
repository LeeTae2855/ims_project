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
		return null;
	}

}
