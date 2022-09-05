package com.raisetech.subject92.service;

import com.raisetech.subject92.entity.Movie;
import com.raisetech.subject92.mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieMapper movieMapper;

    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    @Override
    public Movie findByPublishedYear(int publishedYear) {
        return movieMapper.findByPublishedYear(publishedYear);
    }


}

