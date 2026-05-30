package com.example.BookingSystem.Dto.Threatre;

import com.example.BookingSystem.Model.Screen;
import com.example.BookingSystem.Model.ScreenType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ThreatreResponseDto {
    private Long id;
    private String name;
    private String location;
    private List<ScreenSummaryDto> screens;

}
