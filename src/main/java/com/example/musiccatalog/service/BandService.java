package com.example.musiccatalog.service;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.domain.Band;

/**
 * Created by marcin.bracisiewicz
 */
public interface BandService {

    Iterable<Band> list();

    Band findOneByName(String name);
}
