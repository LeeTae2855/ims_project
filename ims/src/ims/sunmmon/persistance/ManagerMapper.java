package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Manager;
import ims.sunmmon.util.options.sort.ManagerSortOption;

public interface ManagerMapper {
	public List<Manager> list(Manager manager, ManagerSortOption option);

	public void insert(Manager manager);

	public Manager select(Manager manager);

	public void update(Manager manager);

	public void delete(String managerNo);
}
