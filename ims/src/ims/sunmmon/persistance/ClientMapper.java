package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Client;
import ims.sunmmon.util.options.sort.ClientSortOption;

public interface ClientMapper {
	public List<Client> list(Client client, ClientSortOption option);
	
	public void insert(Client client);
	
	public Client select(Client client);

	public void update(Client client);

	public void delete(String clientNo);
}
