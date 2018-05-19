package ims.sunmoon.service.warehousing;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.util.option.sort.WarehousingSortOption;
import ims.sunmoon.domain.Warehousing;
import ims.sunmoon.persistance.WarehousingMapper;

@Service
public class WarehousingServiceImpl implements WarehousingService {
	@Resource
	private WarehousingMapper warehousingMapper;
	
	@Override
	public List<Warehousing> list(Warehousing warehousing) {
		return this.warehousingMapper.list(warehousing);
	}

	@Override
	@Transactional
	public void add(Warehousing warehousing) {
		this.warehousingMapper.insert(warehousing);
	}

	@Override
	public Warehousing view(Warehousing warehousing) {
		return this.warehousingMapper.select(warehousing);
	}

	@Override
	@Transactional
	public void edit(Warehousing warehousing) {
		this.warehousingMapper.update(warehousing);
	}

	@Override
	@Transactional
	public void remove(String warehousingNo) {
		this.warehousingMapper.delete(warehousingNo);
	}
}
