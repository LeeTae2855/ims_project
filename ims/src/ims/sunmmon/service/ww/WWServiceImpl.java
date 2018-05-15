package ims.sunmmon.service.ww;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.WW;
import ims.sunmmon.persistance.WWMapper;
import ims.sunmmon.util.options.sort.WWSortOption;

@Service
public class WWServiceImpl implements WWService {
	@Resource
	private WWMapper wwMapper;
	
	@Override
	public List<WW> list(WW ww, WWSortOption option) {
		return this.wwMapper.list(ww, option);
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
