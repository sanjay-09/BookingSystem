package com.example.BookingSystem.Dto.Show;

import com.example.BookingSystem.Dto.Movie.MovieResponseDto;
import com.example.BookingSystem.Dto.Threatre.ScreenSummaryDto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowResponseDto {
    private Long id;
    private LocalDateTime showTime;
    private Integer price;
    private MovieResponseDto movieResponseDto;
    private ScreenSummaryDto screenSummaryDto;
    private Long threater_id;
}
