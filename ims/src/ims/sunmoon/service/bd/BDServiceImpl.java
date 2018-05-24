package ims.sunmoon.service.bd;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.BD;
import ims.sunmoon.persistance.BDMapper;

@Service
public class BDServiceImpl implements BDService {
	@Resource
	private BDMapper bdMapper;

	@Override
	public List<BD> list(BD bd) {
		bd.setUseable(1);

		return this.bdMapper.list(bd);
	}

	@Override
	public List<BD> list(BD bd, String keyword) {
		List<BD> find = null;
		bd.setUseable(1);
		bd.setKeyword(keyword);

		if (bd.getFindOption() != null) {
			switch (bd.getFindOption()) {
			case NONE:
				find = this.list(bd);
				break;

			case ITEM_CODE:
			case ITEM_NAME:
				find = this.bdMapper.findItem(bd);
				break;

			case CLIENT_NAME:
				find = this.bdMapper.findClient(bd);
				break;

			case CON_VER:
				bd.setConVer(keyword);
				find = this.list(bd);
				break;
			}
		}

		return find;
	}

	@Override
	public List<BD> list(Date first, Date last) {
		BD find = new BD();
		find.setFirst(first);
		find.setLast(last);

		return this.list(find);
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
	public BD view(String bdNo) {
		BD find = new BD();
		find.setBdNo(Integer.parseInt(bdNo));

		return this.view(find);
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
