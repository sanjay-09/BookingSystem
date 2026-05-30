package com.example.BookingSystem.Controller;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Vechile vechile;
    public Student(Vechile vechile){
        this.vechile=vechile;
    }



    public void play(){
        System.out.println("play");
    }
}
