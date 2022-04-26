package com.bidirectional.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bidirectional.entitiy.Cart;
import com.bidirectional.repository.CartRepository;


@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
	
	   public List<Cart> getCarts(){
	        return cartRepository.findAll();
	    }
	   
	    
	    public Page<Cart> findProductsWithPagination(int offset,int pageSize){
	        Page<Cart> categories = cartRepository.findAll(PageRequest.of(offset, pageSize));
	        return  categories;
	    }
	    
	    public Cart getCart(long id){
	        Optional<Cart> cart = cartRepository.findById(id);

	        return cart.get();
	    }
	    public Cart addCart(Cart cart){
	        return cartRepository.save(cart);
	    }
	    public Cart updateCart(long id,Cart cart){
	    	cart.setId(id);
	        return cartRepository.save(cart);
	    }
	    public void deleteCategory(long id){
	    	cartRepository.deleteById(id);
	    }

}
