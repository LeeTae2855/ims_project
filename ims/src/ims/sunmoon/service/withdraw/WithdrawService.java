package ims.sunmoon.service.withdraw;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.Withdraw;

public interface WithdrawService {
	public List<Withdraw> list(Withdraw withdraw);

	public List<Withdraw> list(Date first, Date last);

	public List<Withdraw> list(Withdraw withdraw, String keyword);

	public void add(Withdraw withdraw);

	public Withdraw view(Withdraw withdraw);
	
	public Withdraw view(String withNo);

	public void edit(Withdraw withdraw);

	public void remove(String withNo);
}
