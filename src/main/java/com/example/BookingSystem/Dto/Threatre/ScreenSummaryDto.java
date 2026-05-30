package com.example.BookingSystem.Dto.Threatre;

import com.example.BookingSystem.Model.ScreenType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScreenSummaryDto {

    private Long id;
    private String screenType;
    private String screenName;
    private int capacity;
}
