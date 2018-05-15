package ims.sunmmon.service.ww;

import java.util.List;

import ims.sunmmon.domain.WW;
import ims.sunmmon.util.options.sort.WWSortOption;

public interface WWService {
	public List<WW> list(WW ww, WWSortOption option);
	
	public void add(WW ww);

	public WW view(WW ww);

	public void edit(WW ww);

	public void remove(String wwNo);
}
