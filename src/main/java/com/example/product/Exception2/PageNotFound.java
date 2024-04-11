package com.example.product.Exception2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageNotFound extends RuntimeException{
   private Long id;
//   private String message;
   public PageNotFound(Long id,String message){
       super(message);
        this.id = id;
   }
}
