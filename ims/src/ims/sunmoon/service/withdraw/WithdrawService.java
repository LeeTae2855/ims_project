package ims.sunmoon.service.withdraw;

import java.util.List;

import ims.sunmoon.domain.Withdraw;

public interface WithdrawService {
	public List<Withdraw> list(Withdraw withdraw);
	
	public void add(Withdraw withdraw);

	public Withdraw view(Withdraw withdraw);

	public void edit(Withdraw withdraw);

	public void remove(String withdrawNo);
}
