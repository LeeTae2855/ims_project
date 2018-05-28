package ims.sunmoon.service.bereleased;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Bereleased;
import ims.sunmoon.persistance.BereleasedMapper;

@Service
public class BereleasedServiceImpl implements BereleasedService {
	@Resource
	private BereleasedMapper bereleasedMapper;

	@Override
	public List<Bereleased> list(Bereleased bereleased) {
		bereleased.setUseable(1);

		return this.bereleasedMapper.list(bereleased);
	}

	@Override
	public List<Bereleased> list(Bereleased bereleased, String keyword) {
		List<Bereleased> find = null;
		bereleased.setUseable(1);
		bereleased.setKeyword(keyword);

		if (bereleased.getFindOption() != null) {
			switch (bereleased.getFindOption()) {
			case NONE:
				find = this.list(bereleased);
				break;

			case ITEM_NAME:
				find = this.bereleasedMapper.findItem(bereleased);
				break;

			case CON_VER:
				find = this.list(bereleased);
				break;
			}
		}

		return find;
	}

	@Override
	public List<Bereleased> list(Date first, Date last) {
		Bereleased find = new Bereleased();
		find.setUseable(1);
		find.setFirst(first);
		find.setLast(last);

		return this.list(find);
	}

	@Override
	@Transactional
	public void add(Bereleased bereleased) {
		this.bereleasedMapper.insert(bereleased);
	}

	@Override
	public Bereleased view(Bereleased bereleased) {
		return this.bereleasedMapper.select(bereleased);
	}

	@Override
	public Bereleased view(String beNo) {
		Bereleased find = new Bereleased();
		find.setBeNo(Integer.parseInt(beNo));

		return this.bereleasedMapper.select(find);
	}

	@Override
	@Transactional
	public void edit(Bereleased bereleased) {
		this.bereleasedMapper.update(bereleased);
	}

	@Override
	@Transactional
	public void remove(String bereleasedNo) {
		this.bereleasedMapper.delete(bereleasedNo);
	}
}