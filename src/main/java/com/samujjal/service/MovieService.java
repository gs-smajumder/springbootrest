package com.samujjal.service;

import com.samujjal.domain.Movie;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by samujjal on 16/09/16.
 */
@Service
public class MovieService {
    Map<Integer, Movie> movieMap = new HashMap<>();
    public MovieService(){
        Movie movie = new Movie();
        movie.setId("AVctZ8QZsCCb4R14LRps");
        try {
            movie.setEventUrl(new URI("http://in.bmscdn.com/events/Large/ET00046487.jpg"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        movie.setName("Just Aakasmika");
        movie.setSynopsis("fter being adopted by his ageing parents, Shankar's new home in a mixed neighbourhood introduces him to a colourful world. Things unravel for Shankar as he gets in to an altercation with a <br/>local street gang");

        movieMap.put(1, movie);

        movie = new Movie();
        movie.setId("AVctZ6YRsCCb4R14LRpb");
        try {
            movie.setEventUrl(new URI("http://in.bmscdn.com/events/Large/ET00039892.jpg"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        movie.setName("Pink");
        movie.setSynopsis("After being adopted by his ageing parents, Shankar's new home in a");

        movieMap.put(2, movie);
    }

    public Map<Integer, Movie> getAllMovies(){
        return movieMap;
    }

    public Movie getMovie(int key){
        return movieMap.get(key);
    }
}
