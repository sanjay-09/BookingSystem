package com.example.BookingSystem.Filters;


import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class CounterFilter2 implements Filter {

    private int counter=0;
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Request has reached to the filter 1");

        counter++;
        request.setAttribute("Counter",counter);
        chain.doFilter(request,response);

    }
}
