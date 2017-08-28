package com.example.musiccatalog.service.impl;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.repository.AlbumRepository;
import com.example.musiccatalog.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public Iterable<Album> list() {
        return this.albumRepository.findAll();
    }

    @Override
    public Album getAlbum(long id) {
        return this.albumRepository.findOne(id);
    }

    @Override
    public Iterable<Album> findByBandName(String bandName) {
        return this.albumRepository.findAllByBandNameIgnoreCase(bandName);
    }

    @Override
    public Album findByBandNameAndYear(String bandName, int year) {
        return this.albumRepository.findOneByBandNameIgnoreCaseAndYear(bandName, year);
    }

    @Override
    public Iterable<Album> findByYear(int year) {
        return this.albumRepository.findAllByYear(year);
    }


}
