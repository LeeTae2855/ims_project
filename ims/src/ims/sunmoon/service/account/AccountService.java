package ims.sunmoon.service.account;

import java.util.List;

import ims.sunmoon.domain.Account;

public interface AccountService {
	public List<Account> list(Account account);
			
	public List<Account> list(Account account, String keyword);
	
	public void add(Account account);

	public Account view(Account account);
	
	public Account view(String accountNo);

	public void edit(Account account);

	public void remove(String accountNo);
}
