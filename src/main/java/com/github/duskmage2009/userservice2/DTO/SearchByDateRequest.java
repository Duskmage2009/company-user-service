package com.github.duskmage2009.userservice2.DTO;

import com.github.duskmage2009.userservice2.exception.CheckDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@CheckDate(message = "My message")
public class SearchByDateRequest {
    private LocalDate from;
    private LocalDate to;


}