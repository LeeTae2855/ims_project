package ims.sunmoon.service.ww;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.WW;
import ims.sunmoon.persistance.WWMapper;

@Service
public class WWServiceImpl implements WWService {
	@Resource
	private WWMapper wwMapper;

	@Override
	public List<WW> list(WW ww) {
		ww.setUseable(1);
		return this.wwMapper.list(ww);
	}
	
	@Override
	public List<WW> list(Date first, Date last) {
		WW find = new WW();
		find.setUseable(1);
		find.setFirst(first);
		find.setLast(last);
		return this.list(find);
	}

	@Override
	public List<WW> list(WW ww, String keyword) {
		// TODO: 검색옵션에 따라 로직 구현
		return null;
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
