package com.example.BookingSystem.Dto.Show;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ShowReqDto {

    private List<Long> seatsId;
}
