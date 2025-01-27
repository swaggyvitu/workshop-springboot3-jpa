package com.swaggyvitu.actv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swaggyvitu.actv.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
