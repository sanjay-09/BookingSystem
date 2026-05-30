package com.example.BookingSystem.Controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private Student student;

    public StudentController(Student student){
        this.student=student;
    }

    public void notifyWithEmail(){
        this.student.play();

    }

}
