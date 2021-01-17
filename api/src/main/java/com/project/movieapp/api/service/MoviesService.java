package com.project.movieapp.api.service;

import com.project.movieapp.api.data.Movie;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class MoviesService {
    private final RestTemplate restTemplate = new RestTemplate();

    public List<Movie> list() {
        return restTemplate.getForObject("http://localhost:8080/movies", MoviesResponse.class);
    }

    private static class MoviesResponse extends ArrayList<Movie> {}
}