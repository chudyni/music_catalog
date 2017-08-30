package com.example.musiccatalog.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by marcin.bracisiewicz
 */
@Entity
@Table(name = "bands")
public class Band {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "band")
    private List<Album> albums;

    private Band() {}

    public Band(String name) {
        this.name = name;
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

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
