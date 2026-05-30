package com.example.BookingSystem.Dto.Movie;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MovieRequestDto {
    private String title;
    private String description;
    private String genre;
    private String duration;
    private LocalDate releaseDate;
}
