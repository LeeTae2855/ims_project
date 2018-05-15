package ims.sunmmon.service.item;

import java.util.List;

import ims.sunmmon.domain.Item;
import ims.sunmmon.util.options.sort.ItemSortOption;

public interface ItemService {
	public List<Item> list(Item item, ItemSortOption option);
	
	public void add(Item item);

	public Item view(Item item);

	public void edit(Item item);

	public void remove(String itemNo);
}
