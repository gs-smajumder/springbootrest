package com.samujjal.service;

import com.samujjal.elasticsearch.document.Movie;
import com.samujjal.elasticsearch.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by samujjal on 16/09/16.
 */
@Service
public class MovieService {

    public final MovieRepository movieRepository;


    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Iterable<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovie(String key){
        return movieRepository.findOne(key);
    }
}
