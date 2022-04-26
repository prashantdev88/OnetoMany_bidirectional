package com.bidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bidirectional.entitiy.Item;


public interface ItemRepository extends JpaRepository<Item, Long>{

}




//public interface ItemRepository extends CrudRepository<Item, Long>{
//
//}
