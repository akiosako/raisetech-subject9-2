package com.raisetech.subject92.controller;

import com.raisetech.subject92.entity.Movie;

public class MovieResponse {
    private int publishedYear;
    private String movie;

    public MovieResponse(Movie movie) {
        this.movie = movie.getMovie();
        this.publishedYear = movie.getPublishedYear();
    }
}
