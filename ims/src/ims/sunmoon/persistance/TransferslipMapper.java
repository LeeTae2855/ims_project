package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Transferslip;

public interface TransferslipMapper {
	public List<Transferslip> list(Transferslip transferslip);

	public List<Transferslip> find(Transferslip transferslip);

	public void insert(Transferslip transferslip);

	public Transferslip select(Transferslip transferslip);

	public void update(Transferslip transferslip);

	public void delete(String transferslipNo);
}
