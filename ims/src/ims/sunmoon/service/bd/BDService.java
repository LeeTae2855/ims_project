package ims.sunmoon.service.bd;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.BD;

public interface BDService {
	public List<BD> list(BD bd);
	
	public List<BD> list(Date first, Date last);
	
	public List<BD> list(BD bd, String keyword);
	
	public void add(BD bd);

	public BD view(BD bd);
	
	public BD view(String bdNo);

	public void edit(BD bd);

	public void remove(String bdNo);
}
