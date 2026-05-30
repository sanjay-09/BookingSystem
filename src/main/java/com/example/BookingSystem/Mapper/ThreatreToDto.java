package com.example.BookingSystem.Mapper;

import com.example.BookingSystem.Dto.Threatre.ScreenSummaryDto;
import com.example.BookingSystem.Dto.Threatre.ThreatreResponseDto;
import com.example.BookingSystem.Model.Threatre;

public class ThreatreToDto {
    public static ThreatreResponseDto toDto(Threatre threatre){
        return ThreatreResponseDto.builder()
                .id(threatre.getId())
                .name(threatre.getName())
                .location(threatre.getLocation())
                .screens(threatre.getScreens()
                        .stream().map(screen -> ScreenSummaryDto
                                .builder()
                                .id(screen.getId())
                                .capacity(screen.getCapacity())
                                .screenName(screen.getScreenName())
                                .screenType(screen.getScreenName().toString()).build()).toList())
                .build();
    }
}
