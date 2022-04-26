package com.bidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bidirectional.entitiy.Cart;


public interface CartRepository extends JpaRepository<Cart,Long>{

}



//public interface CartRepository extends CrudRepository<Cart,Long>{
//
//}
