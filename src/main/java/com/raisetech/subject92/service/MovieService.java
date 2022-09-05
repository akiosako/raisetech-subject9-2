package com.raisetech.subject92.service;

import com.raisetech.subject92.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findByPublishedYear(int publishedYear) throws Exception;

}
