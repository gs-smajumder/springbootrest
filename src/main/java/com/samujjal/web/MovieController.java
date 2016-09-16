package com.samujjal.web;

import com.samujjal.domain.Movie;
import com.samujjal.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by samujjal on 16/09/16.
 */

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping("/all")
    public Map<Integer, Movie> getMovies(){
        return movieService.getAllMovies();
    }

    @RequestMapping("{id}")
    public Movie getMovie(@PathVariable("id") int id){
        return movieService.getMovie(id);
    }

}
