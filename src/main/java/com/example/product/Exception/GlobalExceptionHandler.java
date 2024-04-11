package com.example.product.Exception;

import com.example.product.Dto.ExceptionDto;
import com.example.product.Exception2.PageNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
   public ResponseEntity<ExceptionDto>handleArithmeticException() {
ExceptionDto exceptionDto = new ExceptionDto();
exceptionDto.setMessage("Something went wrong");
exceptionDto.setResolution("If you run the code, it will provide undefined solution");
ResponseEntity<ExceptionDto> responseEntity = new ResponseEntity<>(exceptionDto, HttpStatus.BAD_REQUEST);
return responseEntity;
   }
   @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
   public ResponseEntity<ExceptionDto>handleArrayIndexOutOfBoundsException(){
       ExceptionDto exceptionDto = new ExceptionDto();
       exceptionDto.setMessage("Don't ask me to do that I can not do");
       exceptionDto.setResolution("ArrayIndexOutOfBoundsException");
       ResponseEntity<ExceptionDto> responseEntity = new ResponseEntity<>(exceptionDto, HttpStatus.BAD_REQUEST);
       return responseEntity;
   }
    @ExceptionHandler(PageNotFound.class)
   public ResponseEntity<ExceptionDto> handlePageNotFoundException(PageNotFound pageNotFound){
       ExceptionDto exceptionDto = new ExceptionDto();
       exceptionDto.setMessage("invalid id passed");
       exceptionDto.setResolution("Please check the URL");
       ResponseEntity<ExceptionDto> responseEntity = new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
       return responseEntity;
   }
}
