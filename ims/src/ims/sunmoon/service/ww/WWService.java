package ims.sunmoon.service.ww;

import java.util.List;

import ims.sunmoon.domain.WW;

public interface WWService {
	public List<WW> list(WW ww);
	
	public void add(WW ww);

	public WW view(WW ww);

	public void edit(WW ww);

	public void remove(String wwNo);
}
