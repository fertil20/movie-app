package com.project.movieapp.rest;

import com.project.movieapp.entity.MovieEntity;
import com.project.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public List<MovieEntity> list() {
        return movieService.getMovies();
    }
}
