package com.example.musiccatalog.domain;

import javax.persistence.*;

/**
 * Created by marcin.bracisiewicz
 */
@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int year;

    @ManyToOne
    private Band band;

    private Album() {}

    public Album(Band band, String name, int year) {
        this.band = band;
        this.name = name;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
