package com.example.BookingSystem.Controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vechile{
    @Override
    public int wheels() {
        return 2;
    }
}
