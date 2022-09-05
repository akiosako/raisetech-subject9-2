package com.raisetech.subject92.controller;

import com.raisetech.subject92.entity.Movie;
import com.raisetech.subject92.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<Movie> getMovies(@RequestParam(name = "published_year") int publishedYear) {
        try {
            return movieService.findByPublishedYear(publishedYear);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
