package ims.sunmmon.service.account;

import java.util.List;

import ims.sunmmon.domain.Account;
import ims.sunmmon.util.options.sort.AccountSortOption;

public interface AccountService {
	public List<Account> list(Account account, AccountSortOption option);
	
	public void add(Account account);

	public Account view(Account account);

	public void edit(Account account);

	public void remove(String accountNo);
}
