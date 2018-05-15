package ims.sunmmon.service.bereleased;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Bereleased;
import ims.sunmmon.persistance.BereleasedMapper;
import ims.sunmmon.util.options.sort.BereleasedSortOption;

@Service
public class BereleasedServiceImpl implements BereleasedService {
	@Resource
	private BereleasedMapper bereleadedMapper;
	
	@Override
	public List<Bereleased> list(Bereleased bereleased, BereleasedSortOption option) {
		return this.bereleadedMapper.list(bereleased, option);
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
