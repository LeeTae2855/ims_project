package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Warehousing;

public interface WarehousingMapper {
	public List<Warehousing> list(Warehousing warehousing);
	
	public List<Warehousing> findItem(Warehousing warehousing);

	public void insert(Warehousing warehousing);

	public Warehousing select(Warehousing warehousing);

	public void update(Warehousing warehousing);

	public void delete(String wareNo);
}
