package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Deposit;
import ims.sunmmon.util.options.sort.DepositSortOption;

public interface DepositMapper {
	public List<Deposit> list(Deposit deposit, DepositSortOption option);
	
	public void insert(Deposit deposit);
	
	public Deposit select(Deposit deposit);

	public void update(Deposit deposit);

	public void delete(String depositNo);
}
