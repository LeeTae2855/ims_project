package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Bereleased;

public interface BereleasedMapper {
	public List<Bereleased> list(Bereleased bereleased);

	public List<Bereleased> findItem(Bereleased bereleased);

	public void insert(Bereleased bereleased);

	public Bereleased select(Bereleased bereleased);

	public void update(Bereleased bereleased);

	public void delete(String bereleasedNo);
}
