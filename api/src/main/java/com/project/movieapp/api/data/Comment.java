package com.project.movieapp.api.data;

import java.sql.Date;

public class Comment {
    private String text;
    private Date date;
    private String author; //Соотнести с Юзером?

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public Comment(String text, Date date, String author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }
}