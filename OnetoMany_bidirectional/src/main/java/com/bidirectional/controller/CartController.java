package com.bidirectional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidirectional.entitiy.Cart;
import com.bidirectional.repository.CartRepository;
import com.bidirectional.service.CartService;



@RestController
@RequestMapping(value = "cart")
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private CartRepository cartRepository;

    @GetMapping
    public List<Cart> getCategory(){
        return cartService.getCarts();
    }
    @GetMapping("/{id}")
    public Cart getCategory(@PathVariable int id){
        return cartService.getCart(id);
    }
    
//    @GetMapping("/custom")
//    public List<OrderResponse> getCustomCategory(){
//        return categoryRepository.getJoinInformation();
//    }
    
//    @GetMapping("/pagination/{offset}/{pageSize}")
//    private APIResponse<Page<Cart>> getProductsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
//        Page<Cart> productsWithPagination = categoryService.findProductsWithPagination(offset, pageSize);
//        return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);
//    }
//    
    @PostMapping
    public Cart addCategory(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }
    @PutMapping("/{id}")
    public Cart addCategory(@PathVariable long id,@RequestBody Cart cart){
        return cartService.updateCart(id,cart);
    }
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable int id){
    	cartService.deleteCategory(id);
    	return "DELETED "+id;
    }
}
