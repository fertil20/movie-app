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
    JPanel contentPane = new JPanel();
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
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();


    public static void main(String[] args) {
        MoviesService moviesService = new MoviesService();
        JFrame frame1 = new JFrame("MainPage");
        frame1.setSize(800, 600);
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
        label3.setText(movie1.getName());
        label4.setText(movie2.getName());
        label5.setText(movie3.getName());
        label6.setText(movie4.getName());
      //  poster1.addMouseListener(getMouseListener(movie1));
       // poster2.addMouseListener(getMouseListener(movie2));
       // poster3.addMouseListener(getMouseListener(movie3));
      //  poster4.addMouseListener(getMouseListener(movie4));

        contentPane.setLayout(new GridLayout(5, 1));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 4));
        panel1.add(mainButton, BorderLayout.NORTH);
        panel1.add(momentButton, BorderLayout.NORTH);
        panel1.add(personButton, BorderLayout.NORTH);
        panel1.add(lkButton, BorderLayout.NORTH);
        contentPane.add(panel1);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1));
        final JLabel label1 = new JLabel();
        label1.setEnabled(true);
        label1.setText("Главная");
        panel2.add(label1, BorderLayout.CENTER);
        final JLabel label2 = new JLabel();
        label2.setText("Изучай историю по фильмам!");
        panel2.add(label2, BorderLayout.WEST);
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Искать по названию");
        comboBox1.setModel(defaultComboBoxModel1);
        panel2.add(comboBox1, BorderLayout.WEST);
        contentPane.add(panel2, BorderLayout.CENTER);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 4));
        poster1.setBackground(new Color(-1312769));
        poster1.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        panel3.add(poster1);
        poster2.setBackground(new Color(-1312769));
        poster2.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        panel3.add(poster2);
        poster3.setBackground(new Color(-1312769));
        poster3.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        panel3.add(poster3);
        poster4.setBackground(new Color(-1312769));
        poster4.setEnabled(true);
        poster4.setBorder(BorderFactory.createTitledBorder(null, "NULL", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        panel3.add(poster4);
        contentPane.add(panel3);
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 4));
        panel4.add(label3, BorderLayout.CENTER);
        panel4.add(label4, BorderLayout.CENTER);
        panel4.add(label5, BorderLayout.CENTER);
        panel4.add(label6, BorderLayout.CENTER);
        contentPane.add(panel4);
        contentPane.add(showMore, BorderLayout.CENTER);
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