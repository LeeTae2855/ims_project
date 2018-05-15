package ims.sunmmon.service.bereleased;

import java.util.List;

import ims.sunmmon.domain.Bereleased;
import ims.sunmmon.util.options.sort.BereleasedSortOption;

public interface BereleasedService {
	public List<Bereleased> list(Bereleased bereleased, BereleasedSortOption option);
	
	public void add(Bereleased bereleased);

	public Bereleased view(Bereleased bereleased);

	public void edit(Bereleased bereleased);

	public void remove(String bereleasedNo);
}
