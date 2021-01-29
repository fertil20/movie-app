package com.project.movieapp.client.view;

import javax.swing.*;

public class MoviePage {
    private JPanel Filmname;
    private JPanel Country;
    private JTextArea description;
    private JTextArea genre;
    private JLabel duration;
    public JPanel contentPane1;
    private JTextPane filmName;
    private JLabel countryName;

    public void setDescription(String description) {
        this.description.setText(description);
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public void setDuration(String duration) {
        this.duration.setText(duration);
    }

    public void setFilmName(String filmName) {
        this.filmName.setText(filmName);
    }

    public void setCountryName(String countryName) {
        this.countryName.setText(countryName);
    }

    public MoviePage() {
        contentPane1.setName("Movie Page");

        description.setLineWrap(true);
        description.setWrapStyleWord(true);
    }
}