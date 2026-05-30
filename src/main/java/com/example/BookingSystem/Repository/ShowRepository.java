package com.example.BookingSystem.Repository;

import com.example.BookingSystem.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
    Show findByMovie_Title(String name);
    List<Show> findByScreen_Threatre_Name(String name);
    List<Show> findByMovieIdAndScreen_Threatre_Location(Long movieId,String location);
}
