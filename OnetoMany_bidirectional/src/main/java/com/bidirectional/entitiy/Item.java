package com.bidirectional.entitiy;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serialNumber;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "cart_id")
    private Cart cart;

   public Item(String serialNumber, Cart cart){
       this.serialNumber = serialNumber;
       this.cart = cart;
   }
   
   public Item() {}
}










































//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@Entity
//@Table(name = "Item")
////@NoArgsConstructor
//public class Item {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String serialNumber;
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart cart;
//
//   public Item(String serialNumber, Cart cart){
//       this.serialNumber = serialNumber;
//       this.cart = cart;
//   }
//}
