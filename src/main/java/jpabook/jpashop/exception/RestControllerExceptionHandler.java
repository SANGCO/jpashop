package jpabook.jpashop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler(NotEnoughStockException.class)
    public ResponseEntity handleNotEnoughStockException(NotEnoughStockException exception) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorDetails);
    }

}
