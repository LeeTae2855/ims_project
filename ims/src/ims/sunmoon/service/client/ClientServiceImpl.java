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
		return this.clientMapper.list(client);
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