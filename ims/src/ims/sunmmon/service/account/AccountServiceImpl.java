package ims.sunmmon.service.account;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Account;
import ims.sunmmon.persistance.AccountMapper;
import ims.sunmmon.util.options.sort.AccountSortOption;

@Service
public class AccountServiceImpl implements AccountService {
	@Resource
	AccountMapper accountMapper;
	
	@Override
	public List<Account> list(Account account, AccountSortOption option) {
		return this.accountMapper.list(account);
	}

	@Override
	@Transactional
	public void add(Account account) {
		this.accountMapper.insert(account);
	}

	@Override
	public Account view(Account account) {
		return this.accountMapper.select(account);
	}

	@Override
	@Transactional
	public void edit(Account account) {
		this.accountMapper.update(account);
	}

	@Override
	@Transactional
	public void remove(String accountNo) {
		this.accountMapper.delete(accountNo);
	}
}
