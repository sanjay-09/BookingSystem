package com.example.BookingSystem.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;

    private String rowName;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    private Screen screen;
}
