package jpabook.jpashop.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

    private LocalDateTime dateTime;
    private String message;

    public ErrorDetails(LocalDateTime dateTime, String message) {
        this.dateTime = dateTime;
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getMessage() {
        return message;
    }
}
