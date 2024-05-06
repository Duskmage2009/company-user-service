package com.github.duskmage2009.userservice2.repository;

import com.github.duskmage2009.userservice2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAllByBirthDateBetween(LocalDate from, LocalDate to);
}
