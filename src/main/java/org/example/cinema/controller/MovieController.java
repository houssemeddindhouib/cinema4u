package org.example.cinema.controller;

import org.example.cinema.dto.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/movie")
public class MovieController {

    @GetMapping("")
    public List<Movie> info(){
        return List.of(
                new Movie("Spider-man", 2018),
                new Movie("Batman",2008)
        );
    }
}
