package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Client;

public interface ClientMapper {
	List<Client> list();
	
	void insert(Client client);
	
	Client select(Client client);

	void update(Client client);

	void delete(String clientNo);
}
