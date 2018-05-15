package ims.sunmmon.persistance;

import java.util.List;

import ims.sunmmon.domain.Item;
import ims.sunmmon.util.options.sort.ItemSortOption;

public interface ItemMapper {
	public List<Item> list(Item item, ItemSortOption option);
	
	public void insert(Item item);
	
	public Item select(Item item);

	public void update(Item item);

	public void delete(String itemNo);
}
