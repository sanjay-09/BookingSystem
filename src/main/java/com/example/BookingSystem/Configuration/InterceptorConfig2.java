package com.example.BookingSystem.Configuration;


import com.example.BookingSystem.Interceptors.RoleCheckInterceptor2;
import com.example.BookingSystem.Interceptors.TimingCheckInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig2 implements WebMvcConfigurer {

    private RoleCheckInterceptor2 roleCheckInterceptor2;
    private TimingCheckInterceptor2 timingCheckInterceptor2;

    public InterceptorConfig2(RoleCheckInterceptor2 roleCheckInterceptor2,TimingCheckInterceptor2 timingCheckInterceptor2){

        this.roleCheckInterceptor2=roleCheckInterceptor2;
        this.timingCheckInterceptor2=timingCheckInterceptor2;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(roleCheckInterceptor2).addPathPatterns("/admin");
        registry.addInterceptor(timingCheckInterceptor2);
    }
}