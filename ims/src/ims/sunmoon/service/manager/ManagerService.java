package ims.sunmoon.service.manager;

import java.util.List;

import ims.sunmoon.domain.Manager;

public interface ManagerService {
	public List<Manager> list(Manager manager);
	
	public void add(Manager manager);

	public Manager view(Manager manager);

	public void edit(Manager manager);

	public void remove(String managerNo);
}
