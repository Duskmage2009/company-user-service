package com.github.duskmage2009.userservice2.exeption;

import com.github.duskmage2009.userservice2.DTO.SearchByDateRequest;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class CheckDateValidator implements ConstraintValidator<CheckDate, SearchByDateRequest> {

    @Override
    public boolean isValid(SearchByDateRequest searchByDateRequest, ConstraintValidatorContext constraintValidatorContext) {
        return searchByDateRequest.getFrom().isBefore(searchByDateRequest.getTo());
    }

}