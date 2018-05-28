package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Withdraw;

public interface WithdrawMapper {
	public List<Withdraw> list(Withdraw withdraw);

	public void insert(Withdraw withdraw);

	public Withdraw select(Withdraw withdraw);

	public void update(Withdraw withdraw);

	public void delete(String withNo);
}
