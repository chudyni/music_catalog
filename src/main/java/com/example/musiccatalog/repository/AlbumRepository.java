package com.example.musiccatalog.repository;

import com.example.musiccatalog.domain.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by marcin.bracisiewicz
 */
@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {

}
