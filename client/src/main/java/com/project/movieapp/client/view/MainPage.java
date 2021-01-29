package com.project.movieapp.client.view;

import com.project.movieapp.api.service.MoviesService;
import com.project.movieapp.api.data.Movie;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MainPage {
    JFrame contentPane = new JFrame();
    JComboBox comboBox1 = new JComboBox();
    JButton showMore = new JButton("Показать ещё");
    JButton mainButton = new JButton("Главная");
    JButton momentButton = new JButton("События");
    JButton personButton = new JButton("Персоны");
    JButton lkButton = new JButton("Личный кабинет");
    JPanel poster1 = new JPanel();
    JPanel poster2 = new JPanel();
    JPanel poster3 = new JPanel();
    JPanel poster4 = new JPanel();
    JLabel film1 = new JLabel();
    JLabel film2 = new JLabel();
    JLabel film3 = new JLabel();
    JLabel film4 = new JLabel();


    public static void main(String[] args) {
        MoviesService moviesService = new MoviesService();
        JFrame frame1 = new JFrame("MainPage");
        frame1.setSize(600, 400);
        frame1.setLocationRelativeTo(null);
        frame1.setContentPane(new MainPage(moviesService).contentPane);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }

    public MainPage(MoviesService moviesService) {
        List<Movie> movies = moviesService.list();
        Movie movie1 = movies.get(0);
        Movie movie2 = movies.get(1);
        Movie movie3 = movies.get(2);
        Movie movie4 = movies.get(3);
        film1.setText(movie1.getName());
        film2.setText(movie2.getName());
        film3.setText(movie3.getName());
        film4.setText(movie4.getName());
      //  poster1.addMouseListener(getMouseListener(movie1));
       // poster2.addMouseListener(getMouseListener(movie2));
       // poster3.addMouseListener(getMouseListener(movie3));
      //  poster4.addMouseListener(getMouseListener(movie4));

        contentPane.setLayout(new GridLayout(5, 4));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        contentPane.add(panel1);
        final JLabel label1 = new JLabel();
        label1.setEnabled(true);
        label1.setText("Главная");
        panel1.add(label1, BorderLayout.CENTER);
        final JLabel label2 = new JLabel();
        label2.setText("Изучай историю по фильмам!");
        panel1.add(label2, BorderLayout.WEST);
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Искать по названию");
        comboBox1.setModel(defaultComboBoxModel1);
        panel1.add(comboBox1, BorderLayout.WEST);
        poster2.setLayout(new GridLayout(1, 1));
        poster2.setBackground(new Color(-1312769));
        contentPane.add(poster2, BorderLayout.CENTER);
        poster2.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        poster4.setLayout(new GridLayout(1, 1));
        poster4.setBackground(new Color(-1312769));
        poster4.setEnabled(true);
        contentPane.add(poster4, BorderLayout.CENTER);
        poster4.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        poster3.setLayout(new GridLayout(1, 1));
        poster3.setBackground(new Color(-1312769));
        contentPane.add(poster3, BorderLayout.CENTER);
        poster3.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label3 = new JLabel();
        contentPane.add(label3, BorderLayout.CENTER);
        final JLabel label4 = new JLabel();
        contentPane.add(label4);
        final JLabel label5 = new JLabel();
        contentPane.add(label5);
        final JLabel label6 = new JLabel();
        contentPane.add(label6);
        contentPane.add(mainButton, BorderLayout.CENTER);
        contentPane.add(momentButton);
        contentPane.add(personButton);
        contentPane.add(lkButton);
        contentPane.add(showMore);
        poster1.setLayout(new GridLayout(1, 1));
        poster1.setBackground(new Color(-1312769));
        contentPane.add(poster1);
        poster1.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
    }
}
 /*   private MouseAdapter getMouseListener(Movie movie) {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                MoviePage moviePage = new MoviePage();
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                moviePage.setName("MoviePage");
                moviePage.setSize(600, 800);
                moviePage.setLocationRelativeTo(null);
                moviePage.setFilmName(movie.getName());
                moviePage.setGenre(movie.getGenre());
                moviePage.setCountryName(movie.getCountry());
                moviePage.setDescription(movie.getDescription());
                moviePage.setDuration(movie.getDuration().toString());
                moviePage.setContentPane(moviePage.contentPane1);
                moviePage.pack();
                moviePage.setVisible(true);

//                moviePage.pack();
//                moviePage.setVisible(true);
            }
        };

  */