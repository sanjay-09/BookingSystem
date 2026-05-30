package com.example.BookingSystem.Mapper;


import com.example.BookingSystem.Dto.Screen.ScreenResponseDto;
import com.example.BookingSystem.Dto.Screen.SeatSummaryDto;
import com.example.BookingSystem.Model.Screen;

public class SeatToDto {
    public static ScreenResponseDto toDto(Screen screen){

        return ScreenResponseDto.builder()
                .id(screen.getId())
                .screenName(screen.getScreenName())
                .seats(screen.getSeats().stream().map(seat-> SeatSummaryDto.builder()
                        .id(seat.getId())
                        .seatType(seat.getSeatType().toString())
                        .rowName(seat.getRowName())
                        .seatNumber(seat.getSeatNumber()).build()).toList())
                .build();

    }
}
