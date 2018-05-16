package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Account;
import ims.sunmmon.util.options.sort.AccountSortOption;

public interface AccountMapper {
	public List<Account> list(Account account);

	public void insert(Account account);

	public Account select(Account account);

	public void update(Account account);

	public void delete(String accountNo);
}
