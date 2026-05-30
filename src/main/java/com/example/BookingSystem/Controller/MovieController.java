package com.example.BookingSystem.Controller;


import com.example.BookingSystem.Dto.Movie.MovieRequestDto;
import com.example.BookingSystem.Dto.Movie.MovieResponseDto;
import com.example.BookingSystem.Service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieService movieService;
    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }

    @PostMapping("/add")
    public MovieResponseDto createMovie(@RequestBody MovieRequestDto movieRequestDto){
        return  this.movieService.createMovie(movieRequestDto);
    }

    @GetMapping("/all")
    public List<MovieResponseDto> getAllMovies(){
        return this.movieService.findAllMovies();
    }
    @GetMapping(params = "genre")
    public List<MovieResponseDto> getMoviesByGenre(@RequestParam String genre){
        return this.movieService.findMoviesByGenre(genre);
    }

    @GetMapping(params="title")
    public List<MovieResponseDto> getMoviesByTitle(@RequestParam String title){
        return this.movieService.findMoviesByTitle(title);

    }

    @GetMapping("/location")
    public List<MovieResponseDto> getMoviesByLocation(@RequestParam String location){
        return this.movieService.findAllMoviesByLocation(location);

    }
}
