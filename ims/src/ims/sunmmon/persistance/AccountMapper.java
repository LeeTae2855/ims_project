package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Account;

public interface AccountMapper {
	List<Account> list(Account account);

	void insert(Account account);

	Account select(Account account);

	void update(Account account);

	void delete(String accountNo);
}
