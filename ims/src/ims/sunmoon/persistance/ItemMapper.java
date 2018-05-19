package ims.sunmoon.persistance;

import java.util.List;

import ims.sunmoon.domain.Item;

public interface ItemMapper {
	public List<Item> list(Item item);
	
	public void insert(Item item);
	
	public Item select(Item item);

	public void update(Item item);

	public void delete(String itemNo);
}
