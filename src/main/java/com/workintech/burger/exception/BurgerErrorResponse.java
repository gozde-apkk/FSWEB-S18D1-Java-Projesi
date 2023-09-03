package com.workintech.burger.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class BurgerErrorResponse {

    private int status;
    private String message;
    private long timestamp;
}
