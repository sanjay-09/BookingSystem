package com.example.BookingSystem.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer totalAmount;

    private LocalDateTime bookingTime;


    private Integer noOfSeats;



    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;



}
