package com.example.BookingSystem.Dto.Show;


import com.example.BookingSystem.Dto.Movie.MovieResponseDto;
import com.example.BookingSystem.Dto.Threatre.ScreenSummaryDto;
import com.example.BookingSystem.Model.Screen;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowDto {
    private Long id;
    private LocalDateTime showTime;
    private Integer price;
    private Long movieId;
    private Long screenId;

}
