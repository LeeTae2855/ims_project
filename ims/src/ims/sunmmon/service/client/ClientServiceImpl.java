package ims.sunmmon.service.client;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Client;
import ims.sunmmon.persistance.ClientMapper;
import ims.sunmmon.util.options.sort.ClientSortOption;

@Service
public class ClientServiceImpl implements ClientService {
	@Resource
	private ClientMapper clientMapper;
	
	@Override
	public List<Client> list(Client client, ClientSortOption option) {
		return this.clientMapper.list(client, option);
	}

	@Override
	@Transactional
	public void add(Client client) {
		this.clientMapper.insert(client);
	}

	@Override
	public Client view(Client client) {
		return this.clientMapper.select(client);
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
