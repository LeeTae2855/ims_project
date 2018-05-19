package ims.sunmoon.service.deposit;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Deposit;
import ims.sunmoon.persistance.DepositMapper;

@Service
public class DepositServiceImpl implements DepositService {
	@Resource
	private DepositMapper depositMapper;

	@Override
	public List<Deposit> list(Deposit deposit) {
		deposit.setUseable(1);
		return this.depositMapper.list(deposit);
	}

	@Override
	public List<Deposit> list(Date first, Date last) {
		Deposit find = new Deposit();
		find.setFirst(first);
		find.setLast(last);
		return this.list(find);
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
	public Deposit view(String depNo) {
		Deposit find = new Deposit();
		find.setDepNo(Integer.parseInt(depNo));
		return this.view(find);
	}

	@Override
	@Transactional
	public void edit(Deposit deposit) {
		this.depositMapper.update(deposit);
	}

	@Override
	@Transactional
	public void remove(String depNo) {
		this.depositMapper.delete(depNo);
	}
}
