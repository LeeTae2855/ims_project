package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Manager;

public interface ManagerMapper {
	List<Manager> list(Manager manager);

	void insert(Manager manager);

	Manager select(Manager manager);

	void update(Manager manager);

	void delete(String managerNo);
}
