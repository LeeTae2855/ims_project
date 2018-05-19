package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.WW;

public interface WWMapper {
	public List<WW> list(WW ww);

	public void insert(WW ww);

	public WW select(WW ww);

	public void update(WW ww);

	public void delete(String wwNo);
}
