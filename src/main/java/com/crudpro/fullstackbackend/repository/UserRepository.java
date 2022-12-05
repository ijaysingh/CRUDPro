package com.crudpro.fullstackbackend.repository;

import com.crudpro.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
