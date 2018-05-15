package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Bereleased;
import ims.sunmmon.util.options.sort.BereleasedSortOption;

public interface BereleasedMapper {
	public List<Bereleased> list(Bereleased bereleased, BereleasedSortOption option);
	
	public void insert(Bereleased bereleased);
	
	public Bereleased select(Bereleased bereleased);

	public void update(Bereleased bereleased);

	public void delete(String bereleasedNo);
}
