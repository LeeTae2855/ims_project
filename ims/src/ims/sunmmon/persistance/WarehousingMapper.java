package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Warehousing;

public interface WarehousingMapper {
	List<Warehousing> list(Warehousing warehousing);

	void insert(Warehousing warehousing);

	Warehousing select(Warehousing warehousing);

	void update(Warehousing warehousing);

	void delete(String warehousingNo);
}
