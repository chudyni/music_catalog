package com.example.musiccatalog.data;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.domain.Band;
import com.example.musiccatalog.domain.auth.Role;
import com.example.musiccatalog.domain.auth.User;
import com.example.musiccatalog.repository.AlbumRepository;
import com.example.musiccatalog.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


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
//        this.loadUsersRoles();
        this.loadBandsAlbums();
    }

//    private void loadUsersRoles() {
//        final Role user = new Role("USER_ROLE");
//        final Role admin = new Role ("ADMIN_ROLE");
//
//        final User marcinBracisiewicz = new User("m.bracisiewicz@gmail.com", "hello");
//        marcinBracisiewicz.setRoles(new HashSet<>(Arrays.asList(admin, user)));
//
//        final User bugReporter = new User("bugreporter@gmail.com", "bug");
//        bugReporter.setRoles(Collections.singleton(user));
//    }

    private void loadBandsAlbums() {
        final Band aliceInChains = new Band("Alice In Chains");
        this.bandRepository.save(aliceInChains);

        final Album blackGivesWayToBlue = new Album(aliceInChains, "Black Gives Way To Blue", 2009);
        this.albumRepository.save(blackGivesWayToBlue);

        final Album dirt = new Album(aliceInChains, "Dirt", 1992);
        this.albumRepository.save(dirt);
    }
}
