package com.example.BookingSystem.Dto.Show;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ThreatreWithShowDto {

    private Long threatreId;

    private String threatreName;

    private String location;

    private List<ShowDto> shows;



}
