package ims.sunmmon.service.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmmon.domain.Item;
import ims.sunmmon.persistance.ItemMapper;
import ims.sunmmon.util.options.sort.ItemSortOption;

@Service
public class ItemServiceImpl implements ItemService {
	@Resource
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> list(Item item, ItemSortOption option) {
		return this.itemMapper.list(item, option);
	}

	@Override
	@Transactional
	public void add(Item item) {
		this.itemMapper.insert(item);
	}

	@Override
	public Item view(Item item) {
		return this.itemMapper.select(item);
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
