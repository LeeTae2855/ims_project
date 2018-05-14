package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.BD;

public interface BDMapper {
	List<BD> list(BD bd);

	void insert(BD bd);

	BD select(BD bd);

	void update(BD bd);

	void delete(String bdNo);
}
