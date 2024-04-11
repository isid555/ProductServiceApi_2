package com.example.product.Exception2;

public class PageNotFound extends RuntimeException{
   private Long id;

   public PageNotFound(Long id,String message){
       super(message);
       this.id = id;
   }
}
//test