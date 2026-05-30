package com.example.BookingSystem.Filters;


import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(2)
public class ThreadIdFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("request has reached the second filter");
        request.setAttribute("ThreadId",Thread.currentThread().getId());

        chain.doFilter(request,response);

    }
}
