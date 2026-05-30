package com.example.BookingSystem.Service;

import com.example.BookingSystem.Dto.Show.ShowResponseDto;
import com.example.BookingSystem.Dto.Show.ThreatreWithShowDto;
import com.example.BookingSystem.Mapper.ShowtoDto;
import com.example.BookingSystem.Mapper.ThreaterWithShowToDto;
import com.example.BookingSystem.Model.Show;
import com.example.BookingSystem.Repository.ShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {
    private ShowRepository showRepository;
    public ShowService(ShowRepository showRepository){
        this.showRepository=showRepository;
    }


    public ShowResponseDto findById(Long id){
        Show show=this.showRepository.findById(id).orElseThrow(()->new RuntimeException("show with the id"+id+"does not exists"));
        return ShowtoDto.toDto(show);
    }

    public ShowResponseDto findByMovieTitle(String name){
        Show show=this.showRepository.findByMovie_Title(name);
        return ShowtoDto.toDto(show);
    }

    public List<ShowResponseDto> findByThreaterName(String name){
        List<Show> shows=this.showRepository.findByScreen_Threatre_Name(name);
        return shows.stream().map(s->ShowtoDto.toDto(s)).toList();

    }
    public List<ThreatreWithShowDto> findByThreaterLocation(Long movieId, String location){
        List<Show> shows=this.showRepository.findByMovieIdAndScreen_Threatre_Location(movieId,location);
        return ThreaterWithShowToDto.toDto(shows);

    }






}
