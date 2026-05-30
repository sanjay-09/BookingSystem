package com.example.BookingSystem.Dto.Screen;

import com.example.BookingSystem.Model.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeatSummaryDto {

    private Long id;

    private String seatNumber;

    private String rowName;


    private String seatType;

}
