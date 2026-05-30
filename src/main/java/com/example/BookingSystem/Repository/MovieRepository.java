package com.example.BookingSystem.Repository;

import com.example.BookingSystem.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    List<Movie> findByGenre(String genre);
    List<Movie> findByTitleContaining(String name);
    List<Movie> findByShows_Screen_Threatre_Location(String location);
}
