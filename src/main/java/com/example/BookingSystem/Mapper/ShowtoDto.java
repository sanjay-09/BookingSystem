package com.example.BookingSystem.Mapper;

import com.example.BookingSystem.Dto.Movie.MovieResponseDto;
import com.example.BookingSystem.Dto.Show.ShowResponseDto;
import com.example.BookingSystem.Dto.Threatre.ScreenSummaryDto;
import com.example.BookingSystem.Model.Show;
import lombok.Getter;

public class ShowtoDto {
    public static ShowResponseDto toDto(Show show){

        return ShowResponseDto.builder().id(show.getId())
                .price(show.getPrice()).showTime(show.getShowTime())
                .movieResponseDto(MovieResponseDto.builder()
                        .id(show.getMovie().getId())
                        .title(show.getMovie().getTitle())
                        .genre(show.getMovie().getGenre())
                        .description(show.getMovie().getDescription())
                        .duration(show.getMovie().getDuration())
                        .releaseDate(show.getMovie().getReleaseDate())
                        .build()
                )
                .screenSummaryDto(ScreenSummaryDto.builder()
                                .id(show.getScreen().getId())
                                .screenName(show.getScreen().getScreenName())
                        .screenType(show.getScreen().getScreenType().toString())
                        .capacity(show.getScreen().getCapacity())
                                .build())
                .threater_id(show.getScreen().getThreatre().getId())
                .build();

    }
}
