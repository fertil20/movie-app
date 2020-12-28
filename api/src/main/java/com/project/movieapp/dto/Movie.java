package com.project.movieapp.dto;

import lombok.Data;

import java.sql.Time;

@Data
public class Movie {
    private String name;
    //    private Instant release;
    private String country;
    private String genre;
    private Time duration;
    private byte[] poster;
    //    private String poster;
//    private String trailer;
    private String description;
//    private String comment;
//    private String person;
//    private String moment;
//    private String mistake;
}
