package com.example.musiccatalog.data;

import com.example.musiccatalog.domain.Album;
import com.example.musiccatalog.domain.Band;
import com.example.musiccatalog.domain.auth.Role;
import com.example.musiccatalog.domain.auth.User;
import com.example.musiccatalog.repository.AlbumRepository;
import com.example.musiccatalog.repository.BandRepository;
import com.example.musiccatalog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;


/**
 * Created by marcin.bracisiewicz
 */
@Component
public class TestDataProvider {

    @Autowired
    private BandRepository bandRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
        this.loadUsersRoles();
        this.loadBandsAlbums();
    }

    private void loadUsersRoles() {
        final Role user = new Role("USER_ROLE");
        final Role admin = new Role ("ADMIN_ROLE");

        final User marcinBracisiewicz = new User("m.bracisiewicz@gmail.com", "hello");
        marcinBracisiewicz.setRoles(new HashSet<>(Arrays.asList(admin, user)));
        if(!Optional.ofNullable(this.userRepository.findOneByEmail(marcinBracisiewicz.getEmail())).isPresent()) {
            this.userRepository.save(marcinBracisiewicz);
        }

    }

    private void loadBandsAlbums() {
        final Band aliceInChains = new Band("Alice In Chains");
        if(!Optional.ofNullable(this.bandRepository.findOneByNameIgnoreCase(aliceInChains.getName())).isPresent()) {
            this.bandRepository.save(aliceInChains);
        }

        final Album blackGivesWayToBlue = new Album(aliceInChains, "Black Gives Way To Blue", 2009);
        if(!Optional.ofNullable(this.albumRepository.findOneByNameIgnoreCase(blackGivesWayToBlue.getName())).isPresent()) {
            this.albumRepository.save(blackGivesWayToBlue);
        }

        final Album dirt = new Album(aliceInChains, "Dirt", 1992);
        if(!Optional.ofNullable(this.albumRepository.findOneByNameIgnoreCase(dirt.getName())).isPresent()) {
            this.albumRepository.save(dirt);
        }
    }

}
