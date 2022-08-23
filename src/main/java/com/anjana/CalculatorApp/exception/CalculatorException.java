package com.anjana.CalculatorApp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorException extends RuntimeException{

    protected int httpCode = HttpStatus.BAD_REQUEST.value();
    protected String message;
    protected String[] args;
    public CalculatorException(String message, String... args){
        super(message);
        this.message = message;
        this.args = args;
    }

}
