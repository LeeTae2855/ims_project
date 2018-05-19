package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Client;

public interface ClientMapper {
	public List<Client> list(Client client);
	
	public void insert(Client client);
	
	public Client select(Client client);

	public void update(Client client);

	public void delete(String clientNo);
}
