package com.example.BookingSystem.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private ScreenType screenType;

    private String screenName;

    @ManyToOne
    private Threatre threatre;

    private Integer capacity;

    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;



}
