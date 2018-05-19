package ims.sunmoon.service.transferslip;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.util.option.sort.TransferslipSortOption;
import ims.sunmoon.domain.Transferslip;
import ims.sunmoon.persistance.TransferslipMapper;

@Service
public class TransferslipServiceImpl implements TransferslipService {
	@Resource
	private TransferslipMapper transferslipMapper;
	
	@Override
	public List<Transferslip> list(Transferslip transferslip) {
		return this.transferslipMapper.list(transferslip);
	}

	@Override
	@Transactional
	public void add(Transferslip transferslip) {
		this.transferslipMapper.insert(transferslip);
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
}
