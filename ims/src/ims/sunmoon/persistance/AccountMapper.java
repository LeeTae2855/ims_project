package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Account;

public interface AccountMapper {
	public List<Account> list(Account account);

	public void insert(Account account);

	public Account select(Account account);

	public void update(Account account);

	public void delete(String accountNo);
}
