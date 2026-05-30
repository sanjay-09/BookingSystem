package com.example.BookingSystem.Controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class TestC {

    public TestC(){
        System.out.println("prod is up and running");
    }
}
