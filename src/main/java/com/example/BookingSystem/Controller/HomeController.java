package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Configuration.JwtConfiguration;
import com.example.BookingSystem.Service.UserService;
import org.hibernate.annotations.SQLRestriction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    private JwtConfiguration jwtConfiguration;

    public HomeController(JwtConfiguration jwtConfiguration){
        this.jwtConfiguration=jwtConfiguration;
    }

    @GetMapping("/home")
    public String get(){

        System.out.println(this.jwtConfiguration.getKey());

        return "Bye";

    }

}
