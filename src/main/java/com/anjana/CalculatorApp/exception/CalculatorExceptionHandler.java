package com.anjana.CalculatorApp.exception;


import com.anjana.CalculatorApp.models.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class CalculatorExceptionHandler {

    private final MessageSource messageSource;
//adding comment
    @Autowired
    public CalculatorExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(CalculatorException.class)
    public ResponseEntity<ErrorResponse> handleException(CalculatorException calculatorException, Locale locale){


        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpCode(calculatorException.httpCode)
                .message(messageSource.getMessage(calculatorException.getMessage(),calculatorException.getArgs(), locale ))
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
