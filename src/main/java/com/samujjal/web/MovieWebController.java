package com.samujjal.web;

import com.samujjal.elasticsearch.document.Movie;
import com.samujjal.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by samujjal on 17/09/16.
 */
@Controller
public class MovieWebController {
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public String movie(Model model, @PathVariable("id") String id){
        Movie movie = movieService.getMovie(id);
        model.addAttribute("movie", movie);
        return "moviesview";
    }
}
