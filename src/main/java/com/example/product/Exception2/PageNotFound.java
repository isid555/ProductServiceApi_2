package com.example.product.Exception2;

public class PageNotFound extends RuntimeException{
//   private Long id;
//   private String message;
   public PageNotFound(Long id,String message){
       super(message);

   }
}
//test