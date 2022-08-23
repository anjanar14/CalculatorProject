package com.anjana.CalculatorApp.controller;

import com.anjana.CalculatorApp.models.CalculatorRequest;
import com.anjana.CalculatorApp.models.CalculatorResponse;
import com.anjana.CalculatorApp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<CalculatorResponse> calculate(@RequestBody CalculatorRequest calculatorRequest){
        return ResponseEntity.status(HttpStatus.OK).body(calculatorService.calculate(calculatorRequest));
    }
}
