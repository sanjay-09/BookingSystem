package com.example.BookingSystem.Service;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MailerService {

    private JavaMailSender javaMailSender;

    public MailerService(JavaMailSender javaMailSender){
        this.javaMailSender=javaMailSender;
    }

    public void sendResume(MultipartFile resume,String to,String companyName) throws MessagingException {
        MimeMessage mimeMessage =
                javaMailSender.createMimeMessage();

        MimeMessageHelper helper =
                new MimeMessageHelper(
                        mimeMessage,
                        true
                );
        helper.setTo(to);

        helper.setSubject("Java Developer Application – Sanjay Singh | Java | Spring Boot");


        String body = """
        Dear Hiring Team,

        I came across the Java Developer opening at %s and would like to express my interest in the opportunity.

        I have around 3 years of experience in backend development and currently work as a Software Engineer at Indus Valley Partners.

        My experience includes:

        • Developing scalable backend systems using Java and Spring Boot
        • Building an in-house ETL platform (EDM) from scratch for hedge fund organizations
        • Working on REST APIs, database operations, and enterprise applications.

        I believe my experience aligns well with your requirements. Please find my resume attached for your review.

        Looking forward to hearing from you.

        Regards,
        Sanjay Singh
        Phone: 9084211368
        """.formatted(companyName);

        helper.setText(body);

        helper.addAttachment(
                resume.getOriginalFilename(),
                resume
        );

        javaMailSender.send(mimeMessage);




    }


}
