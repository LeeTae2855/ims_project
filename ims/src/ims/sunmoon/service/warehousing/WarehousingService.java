package ims.sunmoon.service.warehousing;

import java.util.List;

import ims.sunmoon.domain.Warehousing;

public interface WarehousingService {
	public List<Warehousing> list(Warehousing warehousing);
	
	public void add(Warehousing warehousing);

	public Warehousing view(Warehousing warehousing);

	public void edit(Warehousing warehousing);

	public void remove(String warehousingNo);
}
