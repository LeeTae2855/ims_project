package ims.sunmoon.service.warehousing;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Warehousing;
import ims.sunmoon.persistance.WarehousingMapper;

@Service
public class WarehousingServiceImpl implements WarehousingService {
	@Resource
	private WarehousingMapper warehousingMapper;

	@Override
	public List<Warehousing> list(Warehousing warehousing) {
		warehousing.setUseable(1);

		return this.warehousingMapper.list(warehousing);
	}

	@Override
	@Transactional
	public void add(Warehousing warehousing) {
		this.warehousingMapper.insert(warehousing);
	}

	@Override
	public Warehousing view(Warehousing warehousing) {
		warehousing.setUseable(1);

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

	@Override
	public List<Warehousing> list(Warehousing warehousing, String keyword) {
		List<Warehousing> find = null;

		if (warehousing.getFindOption() != null) {
			switch (warehousing.getFindOption()) {
			case NONE:
				find = this.list(warehousing);
				break;

			case ITEM_NAME:
				find = this.warehousingMapper.findItem(warehousing);
				break;

			case CON_VER:
				warehousing.setConVer(keyword);
				find = this.list(warehousing);
				break;
			}
		}

		return find;
	}

	@Override
	public List<Warehousing> list(Date first, Date last) {
		Warehousing find = new Warehousing();
		find.setFirst(first);
		find.setLast(last);

		return this.list(find);
	}

	@Override
	public Warehousing view(String wareNo) {
		Warehousing find = new Warehousing();
		find.setWareNo(Integer.parseInt(wareNo));

		return this.view(find);
	}
}
