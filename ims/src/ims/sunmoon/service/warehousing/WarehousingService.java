package ims.sunmoon.service.warehousing;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.Warehousing;

public interface WarehousingService {
	public List<Warehousing> list(Warehousing warehousing);

	public List<Warehousing> list(Warehousing warehousing, String keyword);

	public List<Warehousing> list(Date first, Date last);
	
	public void add(Warehousing warehousing);

	public Warehousing view(Warehousing warehousing);
	
	public Warehousing view(String wareNo);

	public void edit(Warehousing warehousing);

	public void remove(String warehousingNo);
}
