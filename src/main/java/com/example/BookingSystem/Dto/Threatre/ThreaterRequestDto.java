package com.example.BookingSystem.Dto.Threatre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ThreaterRequestDto {
    private String name;
    private Integer capacity;
    private String location;
    private String screenType;
    private String screen;
}
