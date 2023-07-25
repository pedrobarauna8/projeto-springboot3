package com.pedrobarauna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobarauna.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
