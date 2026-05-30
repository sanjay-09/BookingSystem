package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Dto.Screen.ScreenResponseDto;
import com.example.BookingSystem.Service.ScreenService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/screen")
public class ScreenController {
    private ScreenService screenService;
    public ScreenController(ScreenService screenService){
        this.screenService=screenService;
    }

    @GetMapping("/{id}")
    public ScreenResponseDto getScreenById(@PathVariable  Long id){
        return this.screenService.findByScreenId(id);

    }
}
