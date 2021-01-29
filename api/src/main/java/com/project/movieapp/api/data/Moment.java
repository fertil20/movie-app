package com.project.movieapp.api.data;

import java.sql.Date;

public class Moment {
    private String name;
    private Date date;
    private String description;
    private String person;
    private String country;

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getPerson() {

        return person;
    }

    public String getCountry() {

        return country;
    }

    public Moment(String name, Date Date, String description, String person, String country) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.person = person;
        this.country = country;
    }
}
