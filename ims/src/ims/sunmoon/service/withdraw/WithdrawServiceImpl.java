package ims.sunmoon.service.withdraw;

import java.sql.Date;
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
		withdraw.setUseable(1);

		return this.withdrawMapper.list(withdraw);
	}

	@Override
	@Transactional
	public void add(Withdraw withdraw) {
		this.withdrawMapper.insert(withdraw);
	}

	@Override
	public Withdraw view(Withdraw withdraw) {
		withdraw.setUseable(1);

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

	@Override
	public List<Withdraw> list(Date first, Date last) {
		Withdraw find = new Withdraw();
		find.setFirst(first);
		find.setLast(last);

		return this.list(find);
	}

	@Override
	public List<Withdraw> list(Withdraw withdraw, String keyword) {
		List<Withdraw> find = null;
		withdraw.setKeyword(keyword);

		if (withdraw.getFindOption() != null) {
			switch (withdraw.getFindOption()) {
			case NONE:
				find = this.list(withdraw);
				break;

			case WITH_NO:
				withdraw.setWithNo(Integer.parseInt(keyword));
				find = this.list(withdraw);
				break;

			case CLEINT_NO:
				withdraw.setClientNo(Integer.parseInt(keyword));
				find = this.list(withdraw);
				break;

			case CLIENT_NAME:
				find = this.withdrawMapper.find(withdraw);
				break;

			case CON_VER:
				withdraw.setConVer(keyword);
				find = this.list(withdraw);
				break;
			}
		}

		return find;
	}

	@Override
	public Withdraw view(String withNo) {
		Withdraw find = new Withdraw();
		find.setWithNo(Integer.parseInt(withNo));

		return this.view(find);
	}
}
