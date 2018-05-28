package ims.sunmoon.service.withdraw;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Withdraw;
import ims.sunmoon.persistance.WithdrawMapper;

@Service
public class WithdrawServiceImpl implements WithdrawService {
	@Resource
	private WithdrawMapper withdrawMapper;

	@Override
	public List<Withdraw> list(Withdraw withdraw) {
		return this.withdrawMapper.list(withdraw);
	}

	@Override
	@Transactional
	public void add(Withdraw withdraw) {
		this.withdrawMapper.insert(withdraw);
	}

	@Override
	public Withdraw view(Withdraw withdraw) {
		return this.withdrawMapper.select(withdraw);
	}

	@Override
	@Transactional
	public void edit(Withdraw withdraw) {
		this.withdrawMapper.update(withdraw);
	}

	@Override
	@Transactional
	public void remove(String withdrawNo) {
		this.withdrawMapper.delete(withdrawNo);
	}
}
