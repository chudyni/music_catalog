package com.example.musiccatalog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by marcin.bracisiewicz
 */
@Entity
public class Album {

    @Id
    @GeneratedValue
    private long id;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
