package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Withdraw;

public interface WithdrawMapper {
	List<Withdraw> list(Withdraw withdraw);

	void insert(Withdraw withdraw);

	Withdraw select(Withdraw withdraw);

	void update(Withdraw withdraw);

	void delete(String withdrawNo);
}
