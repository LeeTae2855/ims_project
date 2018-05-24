package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Deposit;

public interface DepositMapper {
	public List<Deposit> list(Deposit deposit);

	public List<Deposit> find(Deposit deposit);

	public void insert(Deposit deposit);

	public Deposit select(Deposit deposit);

	public void update(Deposit deposit);

	public void delete(String depositNo);
}
