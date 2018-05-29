package ims.sunmoon.service.ww;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.WW;

public interface WWService {
	public List<WW> list(WW ww);

	public List<WW> list(WW ww, String keyword);

	public List<WW> list(Date first, Date last);

	public void add(WW ww);

	public WW view(WW ww);
	
	public WW view(String wwNo);

	public void edit(WW ww);

	public void remove(String wwNo);

}
