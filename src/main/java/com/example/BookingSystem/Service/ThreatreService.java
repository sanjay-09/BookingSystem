package com.example.BookingSystem.Service;

import com.example.BookingSystem.Dto.Threatre.ThreaterRequestDto;
import com.example.BookingSystem.Dto.Threatre.ThreatreResponseDto;
import com.example.BookingSystem.Mapper.ThreatreToDto;
import com.example.BookingSystem.Model.ScreenType;
import com.example.BookingSystem.Model.Threatre;
import com.example.BookingSystem.Repository.ThreatreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThreatreService {
    private ThreatreRepository threatreRepository;

    public ThreatreService(ThreatreRepository threatreRepository){
        this.threatreRepository=threatreRepository;
    }

    public ThreatreResponseDto createThreater(ThreaterRequestDto threaterRequestDto){
        Threatre threatre=Threatre.builder().
                name(threaterRequestDto.getName())
                .location(threaterRequestDto.getName())
                .build();
        Threatre savedThreatre=this.threatreRepository.save(threatre);
        return ThreatreToDto.toDto(savedThreatre);
    }





    public List<ThreatreResponseDto> getThreatersByNameAndLocation(String name,String location){
        if(name==null&&location==null){
            return new ArrayList<>();
        }
        List<Threatre> threatres;
        if(name==null){
            threatres=this.threatreRepository.findByLocation(location);
        }
        else if(location==null){
            threatres=this.threatreRepository.findByName(name);
        }
        else{
            threatres=this.threatreRepository.findByNameAndLocation(name,location);
        }

        return  threatres.stream().map(threatre -> ThreatreToDto.toDto(threatre)).toList();
    }




}
