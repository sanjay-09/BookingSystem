package com.example.BookingSystem.Repository;


import com.example.BookingSystem.Model.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Long> {
}
