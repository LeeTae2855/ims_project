package ims.sunmoon.service.deposit;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.Deposit;

public interface DepositService {
	public List<Deposit> list(Deposit deposit);
	
	public List<Deposit> list(Deposit deposit, String keyword);

	public List<Deposit> list(Date first, Date last);

	public void add(Deposit deposit);

	public Deposit view(Deposit deposit);

	public Deposit view(String depNo);

	public void edit(Deposit deposit);

	public void remove(String depNo);
}
