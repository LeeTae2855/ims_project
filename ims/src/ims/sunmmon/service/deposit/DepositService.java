package ims.sunmmon.service.deposit;

import java.util.List;

import ims.sunmmon.domain.Deposit;
import ims.sunmmon.util.options.sort.DepositSortOption;

public interface DepositService {
	public List<Deposit> list(Deposit deposit, DepositSortOption option);
	
	public void add(Deposit deposit);

	public Deposit view(Deposit deposit);

	public void edit(Deposit deposit);

	public void remove(String depositNo);
}
