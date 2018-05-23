package ims.sunmoon.service.bereleased;

import java.sql.Date;
import java.util.List;

import ims.sunmoon.domain.Bereleased;

public interface BereleasedService {
	public List<Bereleased> list(Bereleased bereleased);

	public List<Bereleased> list(Bereleased bereleased, String keyword);

	public List<Bereleased> list(Date first, Date last);

	public void add(Bereleased bereleased);

	public Bereleased view(Bereleased bereleased);

	public Bereleased view(String beNo);

	public void edit(Bereleased bereleased);

	public void remove(String bereleasedNo);
}
