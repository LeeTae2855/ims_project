package ims.sunmmon.service.warehousing;

import java.util.List;

import ims.sunmmon.domain.Warehousing;
import ims.sunmmon.util.options.sort.WarehousingSortOption;

public interface WarehousingService {
	List<Warehousing> list(Warehousing warehousing, WarehousingSortOption option);
	
	public void add(Warehousing warehousing);

	public Warehousing view(Warehousing warehousing);

	public void edit(Warehousing warehousing);

	public void remove(String warehousingNo);
}
