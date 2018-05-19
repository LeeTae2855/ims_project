package ims.sunmoon.service.ww;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.util.option.sort.WWSortOption;
import ims.sunmoon.domain.WW;
import ims.sunmoon.persistance.WWMapper;

@Service
public class WWServiceImpl implements WWService {
	@Resource
	private WWMapper wwMapper;
	
	@Override
	public List<WW> list(WW ww) {
		return this.wwMapper.list(ww);
	}

	@Override
	@Transactional
	public void add(WW ww) {
		this.wwMapper.insert(ww);
	}

	@Override
	public WW view(WW ww) {
		return this.wwMapper.select(ww);
	}

	@Override
	@Transactional
	public void edit(WW ww) {
		this.wwMapper.update(ww);
	}

	@Override
	@Transactional
	public void remove(String wwNo) {
		this.wwMapper.delete(wwNo);
	}
}
