package ims.sunmoon.service.deposit;

import java.util.List;

import ims.sunmoon.domain.Deposit;

public interface DepositService {
	public List<Deposit> list(Deposit deposit);
	
	public void add(Deposit deposit);

	public Deposit view(Deposit deposit);

	public void edit(Deposit deposit);

	public void remove(String depositNo);
}
