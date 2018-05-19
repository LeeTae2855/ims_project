package ims.sunmoon.service.account;

import java.util.List;

import ims.sunmoon.domain.Account;

public interface AccountService {
	public List<Account> list(Account account);
	
	public void add(Account account);

	public Account view(Account account);

	public void edit(Account account);

	public void remove(String accountNo);
}
