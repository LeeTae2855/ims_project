package ims.sunmoon.service.account;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Account;
import ims.sunmoon.persistance.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService {
	@Resource
	private AccountMapper accountMapper;
	
	@Override
	public List<Account> list(Account account) {
		account.setUseable(1);
		return this.accountMapper.list(account);
	}
	
	@Override
	public List<Account> list(Account account, String keyword) {
		if (account.getFindOption() != null) {
			switch (account.getFindOption()) {
			case NO:
				account.setAccountNo(Integer.parseInt(keyword));
				break;
			case NAME:
				account.setAccountName(keyword);
				break;
			case BANK_NAME:
				account.setBankName(keyword);
				break;
			case CFC:
				account.setAccountCfc(keyword);
				break;
			}
		}
		return this.list(account);
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
	public Account view(String accountNo) {
		Account account = new Account();
		account.setAccountNo(Integer.parseInt(accountNo));
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
