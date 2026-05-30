package com.example.BookingSystem.Service;

import com.example.BookingSystem.Model.Seat;
import com.example.BookingSystem.Model.SeatStatus;
import com.example.BookingSystem.Model.Show;
import com.example.BookingSystem.Model.ShowSeat;
import com.example.BookingSystem.Repository.SeatRepository;
import com.example.BookingSystem.Repository.ShowRepository;
import com.example.BookingSystem.Repository.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowSeatService {
    private ShowSeatRepository showSeatRepository;
    private ShowRepository showRepository;
    private SeatRepository seatRepository;

    public ShowSeatService(ShowSeatRepository showSeatRepository,ShowRepository showRepository,SeatRepository seatRepository){
        this.showSeatRepository=showSeatRepository;
        this.showRepository=showRepository;
        this.seatRepository=seatRepository;
    }

    public boolean fillSeat(List<Long> seatsNum,Long showId){
        Show show=this.showRepository.findById(showId).orElseThrow(()->new RuntimeException("show with id"+showId+"does not found"));

        int price=show.getPrice();

        int totalCost=price*seatsNum.size();

        List<Seat> seats=this.seatRepository.findAllById(seatsNum);

        List<ShowSeat> showSeats=seats.stream().map(seat -> ShowSeat.builder().status(SeatStatus.LOCKED).price(price).seat(seat).show(show).build()).toList();

        this.showSeatRepository.saveAll(showSeats);
        return true;




    }
}
