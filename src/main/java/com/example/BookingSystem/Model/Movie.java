package com.example.BookingSystem.Model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie")
    @Builder.Default
    private List<Show> shows=new ArrayList<>();

}
