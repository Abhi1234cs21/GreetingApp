package com.example.greetingApp.Controller;


import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.greetingApp.Service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    // ✅ API to send a simple email
    @GetMapping("/send")
    public String sendTestEmail(@RequestParam String to) {
        emailService.sendSimpleEmail(to, "Test Email", "Hello! This is a test email from Spring Boot.");
        return "Simple email sent successfully!";
    }
}