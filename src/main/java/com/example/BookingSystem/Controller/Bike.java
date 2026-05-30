package com.example.BookingSystem.Controller;


import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile{
    @Override
    public int wheels() {
        return 2;
    }
}
