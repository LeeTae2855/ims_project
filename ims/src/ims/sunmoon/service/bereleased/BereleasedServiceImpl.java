package ims.sunmoon.service.bereleased;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.util.option.sort.BereleasedSortOption;
import ims.sunmoon.domain.Bereleased;
import ims.sunmoon.persistance.BereleasedMapper;

@Service
public class BereleasedServiceImpl implements BereleasedService {
	@Resource
	private BereleasedMapper bereleadedMapper;
	
	@Override
	public List<Bereleased> list(Bereleased bereleased) {
		return this.bereleadedMapper.list(bereleased);
	}

	@Override
	@Transactional
	public void add(Bereleased bereleased) {
		this.bereleadedMapper.insert(bereleased);
	}

	@Override
	public Bereleased view(Bereleased bereleased) {
		return this.bereleadedMapper.select(bereleased);
	}

	@Override
	@Transactional
	public void edit(Bereleased bereleased) {
		this.bereleadedMapper.update(bereleased);
	}

	@Override
	@Transactional
	public void remove(String bereleasedNo) {
		this.bereleadedMapper.delete(bereleasedNo);
	}
}
