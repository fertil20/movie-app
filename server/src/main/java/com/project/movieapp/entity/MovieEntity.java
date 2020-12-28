package com.project.movieapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.Instant;

@Data
@Entity
@Table(name = "movies")
public class MovieEntity {
    @Id
    @Column(name = "name")
    private String name;
    //    private Instant release;
    @Column(name = "country")
    private String country;
    @Column(name = "genre")
    private String genre;
    @Column(name = "duration")
    private Time duration;
    @Lob
    @Column(name = "poster")
    private byte[] poster;
    //    private String poster;
//    private String trailer;
    @Column(name = "description")
    private String description;
//    private String comment;
//    private String person;
//    private String moment;
//    private String mistake;
}
