package ims.sunmoon.service.transferslip;

import java.util.List;

import ims.sunmoon.domain.Transferslip;

public interface TransferslipService {
	public List<Transferslip> list(Transferslip transferslip);
	
	public void add(Transferslip transferslip);

	public Transferslip view(Transferslip transferslip);

	public void edit(Transferslip transferslip);

	public void remove(String transferslipNo);
}
