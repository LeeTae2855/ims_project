package ims.sunmmon.service.manager;

import java.util.List;

import ims.sunmmon.domain.Manager;
import ims.sunmmon.util.options.sort.ManagerSortOption;

public interface ManagerService {
	List<Manager> list(Manager manager, ManagerSortOption option);
	
	public void add(Manager manager);

	public Manager view(Manager manager);

	public void edit(Manager manager);

	public void remove(String managerNo);
}
