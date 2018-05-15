package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.BD;
import ims.sunmmon.util.options.sort.BDSortOption;

public interface BDMapper {
	public List<BD> list(BD bd, BDSortOption option);

	public void insert(BD bd);

	public BD select(BD bd);

	public void update(BD bd);

	public void delete(String bdNo);
}
