package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Warehousing;
import ims.sunmmon.util.options.sort.WarehousingSortOption;

public interface WarehousingMapper {
	public List<Warehousing> list(Warehousing warehousing, WarehousingSortOption option);

	public void insert(Warehousing warehousing);

	public Warehousing select(Warehousing warehousing);

	public void update(Warehousing warehousing);

	public void delete(String warehousingNo);
}
