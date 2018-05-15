package ims.sunmmon.service.warehousing;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Warehousing;
import ims.sunmmon.persistance.WarehousingMapper;
import ims.sunmmon.util.options.sort.WarehousingSortOption;

@Service
public class WarehousingServiceImpl implements WarehousingService {
	@Resource
	private WarehousingMapper warehousingMapper;
	
	@Override
	public List<Warehousing> list(Warehousing warehousing, WarehousingSortOption option) {
		return this.warehousingMapper.list(warehousing, option);
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
