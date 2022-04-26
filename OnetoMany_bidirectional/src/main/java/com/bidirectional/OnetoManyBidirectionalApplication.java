package com.bidirectional;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bidirectional.entitiy.Cart;
import com.bidirectional.entitiy.Item;
import com.bidirectional.repository.CartRepository;

@SpringBootApplication
public class OnetoManyBidirectionalApplication {

	
	
	
	
	
	
	
	public static void main(String[] args) {
//		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OnetoManyBidirectionalApplication.class, args);
//		CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);
//		Cart cart = new Cart("C999");
//		Item item = new Item("ABC",cart);
//		Item item1 = new Item("DEF",cart);
//		List<Item> items = Arrays.asList(item,item1);
//		cart.setItems(items);
//		cartRepository.save(cart);
//		cartRepository.delete(cart);
		SpringApplication.run(OnetoManyBidirectionalApplication.class, args);
	}

	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OnetoManyBidirectionalApplication.class, args);
//		CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);
//		Cart cart = new Cart("C999");
//		Item item = new Item("ABC",cart);
//		Item item1 = new Item("DEF",cart);
//		List<Item> items = Arrays.asList(item,item1);
//		cart.setItems(items);
//		cartRepository.save(cart);
//		cartRepository.
////		cartRepository.delete(cart);
//	}

}
