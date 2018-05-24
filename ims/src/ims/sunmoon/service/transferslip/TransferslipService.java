package ims.sunmoon.service.transferslip;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.Transferslip;

public interface TransferslipService {
	public List<Transferslip> list(Transferslip transferslip);

	public List<Transferslip> list(Transferslip transferslip, String keyword);

	public List<Transferslip> list(Date first, Date last);

	public void add(Transferslip transferslip);

	public Transferslip view(Transferslip transferslip);

	public Transferslip view(String tsNo);

	public void edit(Transferslip transferslip);

	public void remove(String transferslipNo);
}
