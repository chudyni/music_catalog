package com.example.musiccatalog.repository;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.domain.Band;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by marcin.bracisiewicz
 */
@Repository
public interface BandRepository extends CrudRepository<Band, Long> {

    Band findOneByNameIgnoreCase(String name);
}
