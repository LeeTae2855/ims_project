package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Deposit;

public interface DepositMapper {
	List<Deposit> list();
	
	void insert(Deposit deposit);
	
	Deposit select(Deposit deposit);

	void update(Deposit deposit);

	void delete(String depositNo);
}
