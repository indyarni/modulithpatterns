package com.kino.reservierung;


import org.springframework.context.ApplicationEvent;

public class ReservierungAbgeholtEvent extends ApplicationEvent {

    private String message;


    public ReservierungAbgeholtEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
