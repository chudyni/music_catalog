package com.example.musiccatalog.service;

import com.example.musiccatalog.domain.Album;

/**
 * Created by marcin.bracisiewicz
 */
public interface AlbumService {

    Album getAlbum(long id);

    Album findByBandNameAndYear(String bandName, int year);

    Iterable<Album> list();

    Iterable<Album> findByBandName(String bandName);

    Iterable<Album> findByYear(int year);
}
