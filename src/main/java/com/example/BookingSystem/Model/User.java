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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    @ManyToMany
    @JoinTable(
            name="user_roles",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id")
    )
    private List<Role> roles;

    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Booking> bookings=new ArrayList<>();

    private int balance;


}
