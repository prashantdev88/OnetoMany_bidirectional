package com.bidirectional.entitiy;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "Cart")
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    
    
    @OneToMany(
    		mappedBy = "cart",
    		cascade = 	CascadeType.ALL,
    		orphanRemoval = true
	)
    @JsonManagedReference
    private List<Item> items = new ArrayList<>();

    public Cart(String name) {
    	this.name = name;
    }
    
    public Cart() {}

    
    public void setItems(List<Item> items) {
    	this.items = items;
    }

}



















































//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@Table(name = "Cart")
//public class Cart {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//
//
//    public Cart(String name){
//        this.name = name;
//    }
//
//
//    @OneToMany(
//            mappedBy ="cart",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    @JoinColumn(name = "cart_id")
//    private List<Item> items = new ArrayList<>();
//
//    public void addItem(Item item){
//        items.add(item);
//    }
//
//    public void removeItem(Item item){
//        items.remove(item);
//    }
//
//
//}
