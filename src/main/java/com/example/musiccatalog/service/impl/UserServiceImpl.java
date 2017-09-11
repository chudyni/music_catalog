package com.example.musiccatalog.service.impl;

import com.example.musiccatalog.domain.auth.User;
import com.example.musiccatalog.repository.UserRepository;
import com.example.musiccatalog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findOneByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        final User user = Optional.of(this.findByEmail(s))
                .orElseThrow(() ->new UsernameNotFoundException(s));

        return new UserDetailsImpl(user);
    }
}
