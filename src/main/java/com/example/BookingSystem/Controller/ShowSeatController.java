package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Dto.Show.ShowReqDto;
import com.example.BookingSystem.Service.ShowSeatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/showSeat")
public class ShowSeatController {
    private ShowSeatService showSeatService;
    public ShowSeatController(ShowSeatService showSeatService){
        this.showSeatService=showSeatService;
    }

    @GetMapping("/{showId}")
    public boolean create(@PathVariable Long showId, @RequestBody ShowReqDto showReqDto){

        return this.showSeatService.fillSeat(showReqDto.getSeatsId(),showId);

    }


}
