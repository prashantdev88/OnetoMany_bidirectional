package com.bidirectional.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bidirectional.entitiy.Item;
import com.bidirectional.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	   public List<Item> getCarts(){
	        return itemRepository.findAll();
	    }
	    
//	    public Page<Item> findProductsWithPagination(int offset,int pageSize){
//	        Page<Cart> items = itemRepository.findAll(PageRequest.of(offset, pageSize));
//	        return  items;
//	    }
	    
	    public Item getItem(long id){
	        Optional<Item> item = itemRepository.findById(id);

	        return item.get();
	    }
	    public Item addItem(Item item){
	        return itemRepository.save(item);
	    }
	    public Item updateItem(long id,Item item){
	    	item.setId(id);
	        return itemRepository.save(item);
	    }
	    public void deleteItem(long id){
	    	itemRepository.deleteById(id);
	    }
}
