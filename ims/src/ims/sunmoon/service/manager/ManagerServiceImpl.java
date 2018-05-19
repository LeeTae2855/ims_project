package ims.sunmoon.service.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.util.option.sort.ManagerSortOption;
import ims.sunmoon.domain.Manager;
import ims.sunmoon.persistance.ManagerMapper;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Resource
	private ManagerMapper managerMapper;
	
	@Override
	public List<Manager> list(Manager manager) {
		return this.managerMapper.list(manager);
	}

	@Override
	@Transactional
	public void add(Manager manager) {
		this.managerMapper.insert(manager);
	}

	@Override
	public Manager view(Manager manager) {
		return this.managerMapper.select(manager);
	}

	@Override
	@Transactional
	public void edit(Manager manager) {
		this.managerMapper.update(manager);
	}

	@Override
	public void remove(String managerNo) {
		this.managerMapper.delete(managerNo);
	}
}
