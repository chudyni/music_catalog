package com.example.musiccatalog.repository;

import com.example.musiccatalog.domain.Album;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by marcin.bracisiewicz
 */
@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {

    List<Album> findAllByBandNameIgnoreCase(String bandName);

    Album findOneByBandNameIgnoreCaseAndYear(String bandName, int year);

    @Query("select a from Album a where a.year = :year")
    List<Album> findAllByYear(@Param(value = "year") int year);
}
