package com.example.musiccatalog.service;

import com.example.musiccatalog.domain.Album;

/**
 * Created by marcin.bracisiewicz
 */
public interface AlbumService {

    Iterable<Album> list();

    Album getAlbum(long id);
}
