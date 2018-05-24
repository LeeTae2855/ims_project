package ims.sunmoon.service.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Item;
import ims.sunmoon.persistance.ItemMapper;

@Service
public class ItemServiceImpl implements ItemService {
	@Resource
	private ItemMapper itemMapper;

	@Override
	public List<Item> list(Item item) {
		item.setUseable(1);

		return this.itemMapper.list(item);
	}

	@Override
	public List<Item> list(Item item, String keyword) {
		List<Item> find = null;
		item.setKeyword(keyword);

		if (item.getFindOption() != null) {
			switch (item.getFindOption()) {
			case NONE:
				find = this.list(item);
				break;

			case ITEM_CODE:
				item.setItemCode(keyword);
				find = this.list(item);
				break;

			case ITEM_NAME:
				item.setItemName(keyword);
				find = this.list(item);
				break;

			case ITEM_CFC:
				// Change CfcOption
				find = this.list(item);
				break;

			case ITEM_STATUS:
				item.setItemStatus(keyword);
				find = this.list(item);
				break;
			}
		}

		return find;
	}

	@Override
	@Transactional
	public void add(Item item) {
		this.itemMapper.insert(item);
	}

	@Override
	public Item view(Item item) {
		item.setUseable(1);

		return this.itemMapper.select(item);
	}

	@Override
	public Item view(String itemCode) {
		Item find = new Item();
		find.setItemCode(itemCode);

		return this.view(find);
	}

	@Override
	@Transactional
	public void edit(Item item) {
		this.itemMapper.update(item);
	}

	@Override
	@Transactional
	public void remove(String itemNo) {
		this.itemMapper.delete(itemNo);
	}
}
