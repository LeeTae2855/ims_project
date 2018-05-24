package ims.sunmoon.service.client;

import java.util.List;

import ims.sunmoon.domain.Client;

public interface ClientService {
	public List<Client> list(Client client);

	public List<Client> list(Client client, String keyword);

	public void add(Client client);

	public Client view(Client client);

	public Client view(String clientNo);

	public void edit(Client client);

	public void remove(String clientNo);
}
