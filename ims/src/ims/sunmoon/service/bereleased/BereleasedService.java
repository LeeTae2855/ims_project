package ims.sunmoon.service.bereleased;

import java.util.List;

import ims.sunmoon.domain.Bereleased;

public interface BereleasedService {
	public List<Bereleased> list(Bereleased bereleased);
	
	public void add(Bereleased bereleased);

	public Bereleased view(Bereleased bereleased);

	public void edit(Bereleased bereleased);

	public void remove(String bereleasedNo);
}
