package com.example.BookingSystem.Mapper;

import com.example.BookingSystem.Dto.Show.ShowDto;
import com.example.BookingSystem.Dto.Show.ThreatreWithShowDto;
import com.example.BookingSystem.Model.Show;
import com.example.BookingSystem.Model.Threatre;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreaterWithShowToDto {
    public static List<ThreatreWithShowDto> toDto(List<Show> shows){
        Map<Threatre, List<Show>> groupedShows =
                shows.stream()
                        .collect(Collectors.groupingBy(
                                show -> show.getScreen().getThreatre()
                        ));

        List<ThreatreWithShowDto> result = new ArrayList<>();

        for(Map.Entry<Threatre, List<Show>> entry : groupedShows.entrySet()){

            Threatre threatre = entry.getKey();

            List<ShowDto> showDtos =
                    entry.getValue()
                            .stream()
                            .map(show -> ShowDto.builder()
                                    .id(show.getId())
                                    .showTime(show.getShowTime())
                                    .price(show.getPrice())
                                    .movieId(show.getMovie().getId())
                                    .screenId(show.getScreen().getId())
                                    .build())
                            .toList();

            ThreatreWithShowDto dto =
                    ThreatreWithShowDto.builder()
                            .threatreId(threatre.getId())
                            .threatreName(threatre.getName())
                            .location(threatre.getLocation())
                            .shows(showDtos)
                            .build();

            result.add(dto);
        }

        return result;



    }
}
