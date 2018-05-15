package ims.sunmmon.service.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Manager;
import ims.sunmmon.persistance.ManagerMapper;
import ims.sunmmon.util.options.sort.ManagerSortOption;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Resource
	private ManagerMapper managerMapper;
	
	@Override
	public List<Manager> list(Manager manager, ManagerSortOption option) {
		return this.managerMapper.list(manager, option);
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
