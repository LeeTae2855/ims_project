package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Transferslip;
import ims.sunmmon.util.options.sort.TransferslipSortOption;

public interface TransferslipMapper {
	public List<Transferslip> list(Transferslip transferslip, TransferslipSortOption option);

	public void insert(Transferslip transferslip);

	public Transferslip select(Transferslip transferslip);

	public void update(Transferslip transferslip);

	public void delete(String transferslipNo);
}
