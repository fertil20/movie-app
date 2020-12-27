package com.project.movieapp.client.service;

import com.project.movieapp.dto.MovieDto;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class MoviesService {
    private final RestTemplate restTemplate = new RestTemplate();

    public List<MovieDto> list() {
        return restTemplate.getForObject("http://localhost:8080/movies", MoviesResponse.class);
    }

    private static class MoviesResponse extends ArrayList<MovieDto> {}
}