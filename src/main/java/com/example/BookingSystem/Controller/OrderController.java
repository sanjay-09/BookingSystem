package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Service.NotificationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.management.Notification;
import java.io.IOException;

@RestController
@RequestMapping("/admin")
public class OrderController {
    private NotificationService notificationService;

    public OrderController(NotificationService notificationService){
        this.notificationService=notificationService;
    }

    @GetMapping("/notify")
    public Integer get(HttpServletRequest httpServletRequest){

        System.out.println("ThreadId"+httpServletRequest.getAttribute("ThreadId"));
        System.out.println("CounterId"+httpServletRequest.getAttribute("CounterId"));

        System.out.println(httpServletRequest.getMethod());


        return this.getNotificationService().hashCode();
    }

    @PostMapping("/test")
    public ResponseEntity<?> fetch(@RequestParam String name,@RequestParam int age){
        System.out.println(name);
        System.out.println(age);

        return ResponseEntity.status(HttpStatus.OK).body("ok");

    }

    @PostMapping("/test2")
    public ResponseEntity<?> fetch2(@RequestParam MultipartFile resume, @RequestParam String to,HttpServletRequest request) throws IOException {
        System.out.println(resume.getBytes());
        System.out.println(resume.getOriginalFilename());
        System.out.println(request.getContentType());
        System.out.println(to);
        return ResponseEntity.status(HttpStatus.OK).body("ok");

    }



    @Lookup
    public NotificationService getNotificationService(){
        return null;
    }

}
