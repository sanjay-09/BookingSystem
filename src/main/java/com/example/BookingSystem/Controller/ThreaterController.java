package com.example.BookingSystem.Controller;

import com.example.BookingSystem.Dto.Threatre.ThreatreResponseDto;
import com.example.BookingSystem.Service.ThreatreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/threatre")
public class ThreaterController {
    private ThreatreService threatreService;
    public ThreaterController(ThreatreService threatreService){
        this.threatreService=threatreService;
    }



    @GetMapping("/byNameAndLocation")
    public List<ThreatreResponseDto> getThreatreByNameAndLocation(@RequestParam(required = false) String name,@RequestParam(required = false) String location){
        System.out.println(name);
        return this.threatreService.getThreatersByNameAndLocation(name,location);
    }


}
