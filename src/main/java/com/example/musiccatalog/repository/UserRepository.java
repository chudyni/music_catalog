package com.example.musiccatalog.repository;

import com.example.musiccatalog.domain.auth.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marcin.bracisiewicz
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByEmail(String email);
}
