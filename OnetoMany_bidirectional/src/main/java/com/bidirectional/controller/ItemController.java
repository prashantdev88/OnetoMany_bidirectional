package com.bidirectional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.bidirectional.entitiy.Item;

import com.bidirectional.repository.ItemRepository;

import com.bidirectional.service.ItemService;

@RestController
@RequestMapping(value = "item")
public class ItemController {

	  @Autowired
	  private ItemService itemService;
	    @Autowired
	    private ItemRepository itemRepository;

	    @GetMapping
	    public List<Item> getItems(){
	        return itemRepository.findAll();
	    }
	    @GetMapping("/{id}")
	    public Item getItemById(@PathVariable int id){
	        return itemRepository.getById(null);
	    }
	    
//	    @GetMapping("/custom")
//	    public List<OrderResponse> getCustomCategory(){
//	        return categoryRepository.getJoinInformation();
//	    }
	    
//	    @GetMapping("/pagination/{offset}/{pageSize}")
//	    private APIResponse<Page<Cart>> getProductsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
//	        Page<Cart> productsWithPagination = categoryService.findProductsWithPagination(offset, pageSize);
//	        return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);
//	    }
	//    
	    @PostMapping
	    public Item addItem(@RequestBody Item item){
	        return itemService.addItem(item);
	    }
	    @PutMapping("/{id}")
	    public Item addCategory(@PathVariable long id,@RequestBody Item item){
	        return itemService.updateItem(id,item);
	    }
	    @DeleteMapping("/{id}")
	    public String deleteCategory(@PathVariable int id){
	    	itemService.deleteItem(id);
	    	return "DELETED "+id;
	    }

}
