package ims.sunmoon.service.item;

import java.util.List;

import ims.sunmoon.domain.Item;

public interface ItemService {
	public List<Item> list(Item item);

	public void add(Item item);

	public Item view(Item item);

	public Item view(String itemCode);

	public void edit(Item item);

	public void remove(String itemNo);
}
