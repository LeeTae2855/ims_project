package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Manager;

public interface ManagerMapper {
	public List<Manager> list(Manager manager);

	public void insert(Manager manager);

	public Manager select(Manager manager);

	public void update(Manager manager);

	public void delete(String managerNo);
}
