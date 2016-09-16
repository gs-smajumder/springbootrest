package com.samujjal.web;

import com.samujjal.domain.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by samujjal on 17/09/16.
 */
@Controller
public class MovieWebController {

    @RequestMapping("/movie")
    public String movie(Model model){
        Movie movie = new Movie();
        movie.setId("AVctZ8QZsCCb4R14LRps");
        try {
            movie.setEventUrl(new URI("http://in.bmscdn.com/events/Large/ET00046487.jpg"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        movie.setName("Just Aakasmika");
        movie.setSynopsis("fter being adopted by his ageing parents, S");
        model.addAttribute("movie", movie);
        return "moviesview";
    }
}
