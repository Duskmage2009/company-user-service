package com.github.duskmage2009.userservice2.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super(String.format("User not found by id =%s",id));
    }
}
