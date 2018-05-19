package ims.sunmoon.domain;

import java.io.Serializable;

import ims.sunmoon.util.option.sort.ClientSortOption;

// 거래처(회사) 
public class Client implements Serializable {

    // 거래처번호 
    private Integer clientNo;

    // 거래처명 
    private String clientName;

    // 상호명 
    private String compName;

    // 대표자 
    private String rep;

    // 사업자번호 
    private Integer bsnLicNo;

    // 종사업장 
    private String bsnEst;

    // 사업장주소 
    private String bsnEstAddr;

    // 업태 
    private String bsnCdt;

    // 종목 
    private String event;

    // 대표전화 
    private Integer repPhone;

    // 대표팩스 
    private Integer repFax;

    // 이메일 
    private String email;

    // 휴대전화 
    private Integer cellphone;

    // 담당자번호 
    private Integer managerNo;

    // 우편번호 
    private Integer zipNo;

    // 계좌정보 
    private Integer accountNo;

    // 사용(조회)가능여부 
    private Integer useable;

    // 비고 
    private String note;
    
    private ClientSortOption clientSortOption;

    public Integer getClientNo() {
        return clientNo;
    }

    public void setClientNo(Integer clientNo) {
        this.clientNo = clientNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public Integer getBsnLicNo() {
        return bsnLicNo;
    }

    public void setBsnLicNo(Integer bsnLicNo) {
        this.bsnLicNo = bsnLicNo;
    }

    public String getBsnEst() {
        return bsnEst;
    }

    public void setBsnEst(String bsnEst) {
        this.bsnEst = bsnEst;
    }

    public String getBsnEstAddr() {
        return bsnEstAddr;
    }

    public void setBsnEstAddr(String bsnEstAddr) {
        this.bsnEstAddr = bsnEstAddr;
    }

    public String getBsnCdt() {
        return bsnCdt;
    }

    public void setBsnCdt(String bsnCdt) {
        this.bsnCdt = bsnCdt;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Integer getRepPhone() {
        return repPhone;
    }

    public void setRepPhone(Integer repPhone) {
        this.repPhone = repPhone;
    }

    public Integer getRepFax() {
        return repFax;
    }

    public void setRepFax(Integer repFax) {
        this.repFax = repFax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public Integer getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(Integer managerNo) {
        this.managerNo = managerNo;
    }

    public Integer getZipNo() {
        return zipNo;
    }

    public void setZipNo(Integer zipNo) {
        this.zipNo = zipNo;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ClientSortOption getClientSortOption() {
		return clientSortOption;
	}

	public void setClientSortOption(ClientSortOption clientSortOption) {
		this.clientSortOption = clientSortOption;
	}

	// Client 모델 복사
    public void CopyData(Client param)
    {
        this.clientNo = param.getClientNo();
        this.clientName = param.getClientName();
        this.compName = param.getCompName();
        this.rep = param.getRep();
        this.bsnLicNo = param.getBsnLicNo();
        this.bsnEst = param.getBsnEst();
        this.bsnEstAddr = param.getBsnEstAddr();
        this.bsnCdt = param.getBsnCdt();
        this.event = param.getEvent();
        this.repPhone = param.getRepPhone();
        this.repFax = param.getRepFax();
        this.email = param.getEmail();
        this.cellphone = param.getCellphone();
        this.managerNo = param.getManagerNo();
        this.zipNo = param.getZipNo();
        this.accountNo = param.getAccountNo();
        this.useable = param.getUseable();
        this.note = param.getNote();
        this.clientSortOption = param.getClientSortOption();
    }
}