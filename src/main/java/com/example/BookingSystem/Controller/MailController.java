package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Service.MailerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/mail")
public class MailController {
    private MailerService mailerService;

    public MailController(MailerService mailerService){
        this.mailerService=mailerService;
    }

    @PostMapping("/sendResume")
    public ResponseEntity<?> send(@RequestParam MultipartFile resume, @RequestParam String to, @RequestParam String company, HttpServletRequest request) throws Exception{

        HttpSession session = request.getSession();
        this.mailerService.sendResume(resume,to,company);

        return ResponseEntity.status(HttpStatus.OK).body("send the resume to HR");


    }
}
