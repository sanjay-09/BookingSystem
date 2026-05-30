package com.example.BookingSystem.Configuration;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "jwt")
@Component
@Getter
@Setter
public class JwtConfiguration {

    private String key;
}
