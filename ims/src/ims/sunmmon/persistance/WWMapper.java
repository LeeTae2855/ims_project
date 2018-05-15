package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.WW;
import ims.sunmmon.util.options.sort.WWSortOption;

public interface WWMapper {
	public List<WW> list(WW ww, WWSortOption option);

	public void insert(WW ww);

	public WW select(WW ww);

	public void update(WW ww);

	public void delete(String wwNo);
}
