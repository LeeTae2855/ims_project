package ims.sunmmon.service.bd;

import java.util.List;

import ims.sunmmon.domain.BD;
import ims.sunmmon.util.options.sort.BDSortOption;

public interface BDService {
	public List<BD> list(BD bd, BDSortOption option);
	
	public void add(BD bd);

	public BD view(BD bd);

	public void edit(BD bd);

	public void remove(String bdNo);
}
