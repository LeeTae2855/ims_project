package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Transferslip;

public interface TransferslipMapper {
	List<Transferslip> list(Transferslip transferslip);

	void insert(Transferslip transferslip);

	Transferslip select(Transferslip transferslip);

	void update(Transferslip transferslip);

	void delete(String transferslipNo);
}
