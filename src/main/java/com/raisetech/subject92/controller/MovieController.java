package com.raisetech.subject92.controller;

import com.raisetech.subject92.entity.Movie;
import com.raisetech.subject92.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController {
    public final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    @GetMapping("/movies/{published_year}")
    public List<MovieResponse> getMovies(@RequestParam("published_year") int published_year) {
        return movieService.findAll().stream().map(MovieResponse::new).collect(Collectors.toList());
    }
}
