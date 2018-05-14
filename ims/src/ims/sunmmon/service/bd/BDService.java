package ims.sunmmon.service.bd;

import java.util.List;

import ims.sunmmon.domain.BD;
import ims.sunmmon.util.options.sort.BDSortOption;

public interface BDService {
	List<BD> list(BD account, BDSortOption option);
	
	public void add(BD account);

	public BD view(BD account);

	public void edit(BD account);

	public void remove(String bdNo);
}
