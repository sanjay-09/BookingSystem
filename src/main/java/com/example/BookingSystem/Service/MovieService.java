package com.example.BookingSystem.Service;

import com.example.BookingSystem.Dto.Movie.MovieRequestDto;
import com.example.BookingSystem.Dto.Movie.MovieResponseDto;
import com.example.BookingSystem.Mapper.MovieToDto;
import com.example.BookingSystem.Model.Movie;
import com.example.BookingSystem.Repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class MovieService {
    private MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository){
        this.movieRepository=movieRepository;
    }


    public MovieResponseDto createMovie(MovieRequestDto movieRequestDto){
        Movie movie=Movie.builder().description(movieRequestDto.getDescription())
                .title(movieRequestDto.getTitle())
                .releaseDate(movieRequestDto.getReleaseDate())
                .genre(movieRequestDto.getGenre())
                .duration(movieRequestDto.getDuration()).build();

        Movie savedMovie=this.movieRepository.save(movie);
        return MovieToDto.toDto(savedMovie);

    }
    public List<MovieResponseDto> findAllMovies(){
        List<Movie> movies=this.movieRepository.findAll();
        return movies.stream().map(movie -> MovieToDto.toDto(movie)).toList();

    }

    public List<MovieResponseDto> findAllMoviesByLocation(String location){
        List<Movie> movies=this.movieRepository.findByShows_Screen_Threatre_Location(location);
        return movies.stream().map(movie -> MovieToDto.toDto(movie)).toList();

    }


    public List<MovieResponseDto> findMoviesByGenre(String genre){
        List<Movie> movies=this.movieRepository.findByGenre(genre);
        return movies.stream().map(movie -> MovieToDto.toDto(movie)).toList();
    }

    public List<MovieResponseDto> findMoviesByTitle(String title){
        List<Movie> movies=this.movieRepository.findByTitleContaining(title);
        return movies.stream().map(movie -> MovieToDto.toDto(movie)).toList();

    }





}
