package ims.sunmoon.service.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Manager;
import ims.sunmoon.persistance.ManagerMapper;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Resource
	private ManagerMapper managerMapper;

	@Override
	public List<Manager> list(Manager manager) {
		manager.setUseable(1);
		return this.managerMapper.list(manager);
	}

	@Override
	public List<Manager> list(Manager manager, String keyword) {
		if (manager.getFindOption() != null) {
			switch (manager.getFindOption()) {
			case NO:
				manager.setManagerNo(Integer.parseInt(keyword));
				break;
				
			case NAME:
				manager.setManagerName(keyword);
				break;
			}
		}
		return this.list(manager);
	}

	@Override
	@Transactional
	public void add(Manager manager) {
		this.managerMapper.insert(manager);
	}

	@Override
	public Manager view(Manager manager) {
		manager.setUseable(1);
		return this.managerMapper.select(manager);
	}

	@Override
	public Manager view(String managerNo) {
		Manager find = new Manager();
		find.setManagerNo(Integer.parseInt(managerNo));
		return this.view(find);
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
