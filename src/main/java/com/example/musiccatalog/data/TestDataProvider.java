package com.example.musiccatalog.data;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.domain.Band;
import com.example.musiccatalog.repository.AlbumRepository;
import com.example.musiccatalog.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by marcin.bracisiewicz
 */
@Component
public class TestDataProvider {

    @Autowired
    private BandRepository bandRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @PostConstruct
    public void init() {
        final Band aliceInChains = new Band("Alice In Chains");
        this.bandRepository.save(aliceInChains);

        final Album blackGivesWayToBlue = new Album(aliceInChains, "Black Gives Way To Blue", 2009);
        this.albumRepository.save(blackGivesWayToBlue);

        final Album dirt = new Album(aliceInChains, "Dirt", 1992);
        this.albumRepository.save(dirt);
    }
}
