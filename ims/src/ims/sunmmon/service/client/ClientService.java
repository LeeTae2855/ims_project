package ims.sunmmon.service.client;

import java.util.List;

import ims.sunmmon.domain.Client;
import ims.sunmmon.util.options.sort.ClientSortOption;

public interface ClientService {
	public List<Client> list(Client client, ClientSortOption option);
	
	public void add(Client client);

	public Client view(Client client);

	public void edit(Client client);

	public void remove(String clientNo);
}
