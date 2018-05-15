package ims.sunmmon.service.withdraw;

import java.util.List;

import ims.sunmmon.domain.Withdraw;
import ims.sunmmon.util.options.sort.WithdrawSortOption;

public interface WithdrawService {
	public List<Withdraw> list(Withdraw withdraw, WithdrawSortOption option);
	
	public void add(Withdraw withdraw);

	public Withdraw view(Withdraw withdraw);

	public void edit(Withdraw withdraw);

	public void remove(String withdrawNo);
}
