package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.BD;

public interface BDMapper {
	public List<BD> list(BD bd);

	public List<BD> findItem(BD bd);

	public List<BD> findClient(BD bd);

	public void insert(BD bd);

	public BD select(BD bd);

	public void update(BD bd);

	public void delete(String bdNo);
}
