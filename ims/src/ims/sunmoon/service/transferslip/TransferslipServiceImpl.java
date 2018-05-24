package ims.sunmoon.service.transferslip;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Transferslip;
import ims.sunmoon.persistance.TransferslipMapper;

@Service
public class TransferslipServiceImpl implements TransferslipService {
	@Resource
	private TransferslipMapper transferslipMapper;

	@Override
	public List<Transferslip> list(Transferslip transferslip) {
		transferslip.setUseable(1);

		return this.transferslipMapper.list(transferslip);
	}

	@Override
	@Transactional
	public void add(Transferslip transferslip) {
		if (transferslip.getDebtorNo() != transferslip.getCreditNo()) {
			this.transferslipMapper.insert(transferslip);
		}
	}

	@Override
	public Transferslip view(Transferslip transferslip) {
		return this.transferslipMapper.select(transferslip);
	}

	@Override
	@Transactional
	public void edit(Transferslip transferslip) {
		this.transferslipMapper.update(transferslip);
	}

	@Override
	@Transactional
	public void remove(String transferslipNo) {
		this.transferslipMapper.delete(transferslipNo);
	}

	@Override
	public List<Transferslip> list(Transferslip transferslip, String keyword) {
		List<Transferslip> find = null;
		transferslip.setUseable(1);
		transferslip.setKeyword(keyword);

		if (transferslip.getFindOption() != null) {
			switch (transferslip.getFindOption()) {
			case NONE:
				find = this.list(transferslip);
				break;

			case DEBTOR_NO:
				transferslip.setDebtorNo(Integer.parseInt(keyword));
				find = this.transferslipMapper.find(transferslip);
				break;

			case CREDIT_NO:
				transferslip.setCreditNo(Integer.parseInt(keyword));
				find = this.transferslipMapper.find(transferslip);
				break;

			case CREDIT_NAME:
				transferslip.setCreditName(keyword);
				find = this.transferslipMapper.find(transferslip);
				break;

			case DEBTOR_NAME:
				transferslip.setCreditName(keyword);
				find = this.transferslipMapper.find(transferslip);
				break;

			case CON_VER:
				transferslip.setConVer(keyword);
				find = this.transferslipMapper.find(transferslip);
				break;
			}
		}

		return find;
	}

	@Override
	public Transferslip view(String tsNo) {
		Transferslip find = new Transferslip();
		find.setTsNo(Integer.parseInt(tsNo));

		return this.view(find);
	}

	@Override
	public List<Transferslip> list(Date first, Date last) {
		Transferslip find = new Transferslip();
		find.setFirst(first);
		find.setLast(last);

		return this.list(find);
	}
}
