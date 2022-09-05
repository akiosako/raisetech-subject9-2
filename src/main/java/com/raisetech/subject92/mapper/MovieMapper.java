package com.raisetech.subject92.mapper;

import com.raisetech.subject92.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movie_list")
    List<Movie> findAll();

    @Select("SELECT * FROM movie_list WHERE published_year = #{publishedYear}")
    Movie findByPublishedYear(int publishedYear);

}



