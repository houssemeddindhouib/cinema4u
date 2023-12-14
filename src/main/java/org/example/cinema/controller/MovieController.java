package org.example.cinema.controller;

import org.example.cinema.dto.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/movie")
public class MovieController {

    @GetMapping("")
    public List<Movie> info(){
        return List.of(
                new Movie(0,"Spider-man", 2018),
                new Movie(1,"Batman",2008)
        );
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public  Movie add(Movie movie){
        String random = UUID.randomUUID().toString();
        int r = Integer.parseInt(random.substring(0,random.indexOf("-")));
        movie.setId(r);
        return movie;
    }
}
