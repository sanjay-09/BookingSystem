package com.example.BookingSystem.Controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationService2 {
    private StudentController studentController;
    public NotificationService2(StudentController studentController){
        this.studentController=studentController;
    }

    public void email(){
        this.studentController.notifyWithEmail();
    }
}
