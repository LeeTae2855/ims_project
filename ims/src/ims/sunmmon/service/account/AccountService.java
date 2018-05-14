package ims.sunmmon.service.account;

import java.util.List;

import ims.sunmmon.domain.Account;

public interface AccountService {
	List<Account> list(Account account);
	
	public void add(Account account);

	public Account view(Account account);

	public void edit(Account account);

	public void remove(String accountNo);
}
