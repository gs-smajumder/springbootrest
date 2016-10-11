package com.samujjal.web;

import com.google.common.collect.Lists;
import com.samujjal.elasticsearch.document.Movie;
import com.samujjal.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by samujjal on 16/09/16.
 */

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Movie> getMovies(){
        return Lists.newArrayList(movieService.getAllMovies());
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Movie getMovie(@PathVariable("id") String id){
        return movieService.getMovie(id);
    }

}
