package com.example.BookingSystem.Dto.Movie;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MovieResponseDto {

    private Long id;
    private String title;
    private String description;
    private String genre;
    private String duration;
    private LocalDate releaseDate;

}
