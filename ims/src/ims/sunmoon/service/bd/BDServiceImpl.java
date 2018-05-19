package ims.sunmoon.service.bd;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.util.option.sort.BDSortOption;
import ims.sunmoon.domain.BD;
import ims.sunmoon.persistance.BDMapper;

@Service
public class BDServiceImpl implements BDService {
	@Resource
	private BDMapper bdMapper;

	@Override
	public List<BD> list(BD bd) {
		return this.bdMapper.list(bd);
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
