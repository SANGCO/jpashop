package jpabook.jpashop.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotEnoughStockException.class)
    public String handleNotEnoughStockException(NotEnoughStockException exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        return "members/memberList";
    }

}
