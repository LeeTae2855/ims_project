package ims.sunmmon.service.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import ims.sunmmon.domain.LoginInfo;
import ims.sunmmon.persistance.LoginInfoMapper;

@Service
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginInfoMapper loginInfoMapper;
	
	@Override
	public LoginInfo login(HttpServletRequest request) throws Exception {
		return null;
	}

}
