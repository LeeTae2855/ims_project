package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Item;

public interface ItemMapper {
	List<Item> list();
	
	void insert(Item item);
	
	Item select(Item item);

	void update(Item item);

	void delete(String itemNo);
}
