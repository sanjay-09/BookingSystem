package com.example.BookingSystem.Mapper;

import com.example.BookingSystem.Dto.Movie.MovieResponseDto;
import com.example.BookingSystem.Model.Movie;

public class MovieToDto {

    public static MovieResponseDto toDto(Movie movie){
        return MovieResponseDto.builder()
                .releaseDate(movie.getReleaseDate())
                .id(movie.getId())
                .genre(movie.getGenre())
                .description(movie.getDescription())
                .title(movie.getTitle())
                .duration(movie.getDuration())
                .build();

    }
}
