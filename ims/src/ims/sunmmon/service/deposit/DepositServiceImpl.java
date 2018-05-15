package ims.sunmmon.service.deposit;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Deposit;
import ims.sunmmon.persistance.DepositMapper;
import ims.sunmmon.util.options.sort.DepositSortOption;

@Service
public class DepositServiceImpl implements DepositService {
	@Resource
	private DepositMapper depositMapper;
	
	@Override
	public List<Deposit> list(Deposit deposit, DepositSortOption option) {
		return this.depositMapper.list(deposit, option);
	}

	@Override
	@Transactional
	public void add(Deposit deposit) {
		this.depositMapper.insert(deposit);
	}

	@Override
	public Deposit view(Deposit deposit) {
		return this.depositMapper.select(deposit);
	}

	@Override
	@Transactional
	public void edit(Deposit deposit) {
		this.depositMapper.update(deposit);
	}

	@Override
	@Transactional
	public void remove(String depositNo) {
		this.depositMapper.delete(depositNo);
	}
}
