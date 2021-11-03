package ru.vsu.csf.Sashina.Study.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons;
    @Column(columnDefinition = "TEXT")
    private String full_text;
    private int views;
    private LocalDate date;

    public Post() {
    }

    public Post(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.date = LocalDate.now();
    }
}
