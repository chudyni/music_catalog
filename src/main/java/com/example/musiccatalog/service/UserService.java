package com.example.musiccatalog.service;

import com.example.musiccatalog.domain.auth.User;

/**
 * Created by marcin.bracisiewicz
 */
public interface UserService {

    User findByEmail(String email);
}
