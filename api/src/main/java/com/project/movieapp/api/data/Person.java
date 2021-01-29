package com.project.movieapp.api.data;

import java.sql.Date;

public class Person {
    private String name;
    private String activity;
    private Date birth;
    private Date death;
    private String homeland;
    private String moment;

    public String getName() {
        return name;
    }

    public String getActivity() {
        return activity;
    }

    public Date getBirth() {
        return birth;
    }

    public Date getDeath() {

        return death;
    }

    public String getHomeland() {

        return homeland;
    }

    public String getMoment() {

        return moment;
    }

    public Person(String name, String activity, Date birth, Date death, String homeland, String moment) {
        this.name = name;
        this.activity = activity;
        this.birth = birth;
        this.death = death;
        this.homeland = homeland;
        this.moment = moment;
    }
}
