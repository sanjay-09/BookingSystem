package com.example.BookingSystem.Repository;

import com.example.BookingSystem.Model.ScreenType;
import com.example.BookingSystem.Model.Threatre;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThreatreRepository extends JpaRepository<Threatre,Long> {

    @EntityGraph(attributePaths = {"screens"})
    List<Threatre> findByName(String name);
    List<Threatre> findByLocation(String location);
    List<Threatre> findByNameAndLocation(String name,String location);

}
