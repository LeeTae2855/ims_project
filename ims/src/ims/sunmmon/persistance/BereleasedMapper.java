package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Bereleased;

public interface BereleasedMapper {
	List<Bereleased> list();
	
	void insert(Bereleased bereleased);
	
	Bereleased select(Bereleased bereleased);

	void update(Bereleased bereleased);

	void delete(String bereleasedNo);
}
