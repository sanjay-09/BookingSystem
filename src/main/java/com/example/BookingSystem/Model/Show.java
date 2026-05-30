package com.example.BookingSystem.Model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime showTime;

    private Integer price;

    @ManyToOne
    private Screen screen;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "show")
    @Builder.Default
    private List<Booking> bookings=new ArrayList<>();

}
