package com.example.musiccatalog.service.impl;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.domain.Band;
import com.example.musiccatalog.repository.BandRepository;
import com.example.musiccatalog.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class BandServiceImpl implements BandService {

    @Autowired
    private BandRepository bandRepository;

    @Override
    public Iterable<Band> list() {
        return this.bandRepository.findAll();
    }

    @Override
    public Band findOneByName(String name) {
        return this.bandRepository.findOneByNameIgnoreCase(name);
    }
}
