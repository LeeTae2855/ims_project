package ims.sunmmon.service.transferslip;

import java.util.List;

import ims.sunmmon.domain.Transferslip;
import ims.sunmmon.util.options.sort.TransferslipSortOption;

public interface TransferslipService {
	List<Transferslip> list(Transferslip transferslip, TransferslipSortOption option);
	
	public void add(Transferslip transferslip);

	public Transferslip view(Transferslip transferslip);

	public void edit(Transferslip transferslip);

	public void remove(String transferslipNo);
}
