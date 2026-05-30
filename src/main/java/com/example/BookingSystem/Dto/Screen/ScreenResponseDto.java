package com.example.BookingSystem.Dto.Screen;


import com.example.BookingSystem.Model.ScreenType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScreenResponseDto {

    private Long id;

    private String screenName;

    private List<SeatSummaryDto> seats;



}
