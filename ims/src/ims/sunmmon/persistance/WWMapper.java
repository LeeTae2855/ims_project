package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.WW;

public interface WWMapper {
	List<WW> list(WW ww);

	void insert(WW ww);

	WW select(WW ww);

	void update(WW ww);

	void delete(String wwNo);
}
