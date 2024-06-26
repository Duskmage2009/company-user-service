package com.github.duskmage2009.userservice2.service;

import com.github.duskmage2009.userservice2.DTO.UserCreateUpdateDTO;
import com.github.duskmage2009.userservice2.DTO.UserReadDTO;


import java.time.LocalDate;
import java.util.List;

public interface UserService {
    UserReadDTO create(UserCreateUpdateDTO userCreateUpdateDTO);

    UserReadDTO partialUpdate(UserCreateUpdateDTO userCreateUpdateDTO, Long id);

    UserReadDTO fullUpdate(UserCreateUpdateDTO userCreateUpdateDTO, Long id);

    void delete(Long id);

    List<UserReadDTO>searchByBirthDateBetween(LocalDate from,LocalDate to);
}
