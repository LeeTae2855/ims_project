package ims.sunmoon.domain;

import java.io.Serializable;

// 계정(로그인아이디) 
public class LoginInfo implements Serializable {

    // 아이디 
    private String loginId;

    // 비밀번호 
    private String loginPassword;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    // LoginInfo 모델 복사
    public void CopyData(LoginInfo param)
    {
        this.loginId = param.getLoginId();
        this.loginPassword = param.getLoginPassword();
    }
}