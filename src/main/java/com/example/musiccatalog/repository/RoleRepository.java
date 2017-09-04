package com.example.musiccatalog.repository;

import com.example.musiccatalog.domain.auth.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marcin.bracisiewicz
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findOneByName(String name);

}
