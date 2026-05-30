package com.example.BookingSystem.Service;


import com.example.BookingSystem.Dto.Screen.ScreenResponseDto;
import com.example.BookingSystem.Mapper.SeatToDto;
import com.example.BookingSystem.Model.Screen;
import com.example.BookingSystem.Repository.ScreenRepository;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {
    private ScreenRepository screenRepository;
    public ScreenService(ScreenRepository screenRepository){
        this.screenRepository=screenRepository;
    }


    public ScreenResponseDto findByScreenId(Long id){
        Screen screen=this.screenRepository.findById(id).orElseThrow(()->new RuntimeException("screen with id"+id+"does not found"));
        return SeatToDto.toDto(screen);

    }

}
