package ims.sunmmon.service.bd;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.BD;
import ims.sunmmon.persistance.BDMapper;
import ims.sunmmon.util.options.sort.BDSortOption;

@Service
public class BDServiceImpl implements BDService {
	@Resource
	private BDMapper bdMapper;

	@Override
	public List<BD> list(BD bd, BDSortOption option) {
		return this.bdMapper.list(bd, option);
	}

	@Override
	@Transactional
	public void add(BD bd) {
		this.bdMapper.insert(bd);
	}

	@Override
	public BD view(BD bd) {
		return this.bdMapper.select(bd);
	}

	@Override
	@Transactional
	public void edit(BD bd) {
		this.bdMapper.update(bd);
	}

	@Override
	@Transactional
	public void remove(String bdNo) {
		this.bdMapper.delete(bdNo);
	}
}
