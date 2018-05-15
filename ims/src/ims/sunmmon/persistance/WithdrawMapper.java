package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Withdraw;
import ims.sunmmon.util.options.sort.WithdrawSortOption;

public interface WithdrawMapper {
	public List<Withdraw> list(Withdraw withdraw, WithdrawSortOption option);

	public void insert(Withdraw withdraw);

	public Withdraw select(Withdraw withdraw);

	public void update(Withdraw withdraw);

	public void delete(String withdrawNo);
}
