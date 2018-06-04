package ims.sunmoon.service.client;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Client;
import ims.sunmoon.persistance.ClientMapper;

@Service
public class ClientServiceImpl implements ClientService {
	@Resource
	private ClientMapper clientMapper;

	@Override
	public List<Client> list(Client client) {
		client.setUseable(1);

		return this.clientMapper.list(client);
	}

	@Override
	public List<Client> list(Client client, String keyword) {
		List<Client> find = null;

		if (client.getFindOption() != null) {
			switch (client.getFindOption()) {
			case NONE:
				find = this.list(client);
				break;

			case NO:
				client.setClientNo(Integer.parseInt(keyword));
				find = this.list(client);
				break;

			case NAME:
				client.setClientName(keyword);
				find = this.list(client);
				break;
			}
		}

		return find;
	}

	@Override
	@Transactional
	public void add(Client client) {
		this.clientMapper.insert(client);
	}

	@Override
	public Client view(Client client) {
		client.setUseable(1);

		return this.clientMapper.select(client);
	}

	@Override
	public Client view(String clientNo) {
		Client find = new Client();
		find.setClientNo(Integer.parseInt(clientNo));

		return this.view(find);
	}

	@Override
	@Transactional
	public void edit(Client client) {
		this.clientMapper.update(client);
	}

	@Override
	@Transactional
	public void remove(String clientNo) {
		this.clientMapper.delete(clientNo);
	}
}
