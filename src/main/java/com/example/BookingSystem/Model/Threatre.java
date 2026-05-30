package com.example.BookingSystem.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Threatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String location;


    @OneToMany(mappedBy = "threatre")
    @Builder.Default
    private List<Screen> screens=new ArrayList<>();



}
