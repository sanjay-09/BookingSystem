package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Dto.Show.ShowResponseDto;
import com.example.BookingSystem.Dto.Show.ThreatreWithShowDto;
import com.example.BookingSystem.Service.ShowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/show")
public class ShowController {
    private ShowService showService;
    public ShowController(ShowService showService){
        this.showService=showService;
    }

    @GetMapping("/{id}")
    public ShowResponseDto findById(@PathVariable Long id){
        return  this.showService.findById(id);

    }

    @GetMapping("/movie")
    public ShowResponseDto findByMovieTitle(@RequestParam String title){
        return this.showService.findByMovieTitle(title);
    }
    @GetMapping("/threatre")
    public List<ShowResponseDto> findBYThreaterName(@RequestParam String name){
        return this.showService.findByThreaterName(name);
    }
    @GetMapping("/{movieId}/threatreLocation")
    public List<ThreatreWithShowDto> findBYThreaterLocation(@PathVariable Long movieId, @RequestParam String location){
        return this.showService.findByThreaterLocation(movieId,location);
    }

}
