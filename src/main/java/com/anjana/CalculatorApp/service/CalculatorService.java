package com.anjana.CalculatorApp.service;

import com.anjana.CalculatorApp.exception.CalculatorException;
import com.anjana.CalculatorApp.models.CalculatorRequest;
import com.anjana.CalculatorApp.models.CalculatorResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public CalculatorResponse calculate(CalculatorRequest calculatorRequest) {
        CalculatorResponse calculatorResponse = new CalculatorResponse();
        calculatorResponse.setNumber1(calculatorRequest.getNumber1());
        calculatorResponse.setNumber2(calculatorRequest.getNumber2());
        calculatorResponse.setOperation(calculatorRequest.getOperation());
        switch (calculatorRequest.getOperation().toLowerCase()){
            case "add":
                calculatorResponse.setResult(calculatorRequest.getNumber1() + calculatorRequest.getNumber2());
                break;
            case "subtract":
                calculatorResponse.setResult(calculatorRequest.getNumber1() - calculatorRequest.getNumber2());
                break;
            case "multiply":
                calculatorResponse.setResult(calculatorRequest.getNumber1() * calculatorRequest.getNumber2());
                break;
            case "divide":
                calculatorResponse.setResult(calculatorRequest.getNumber1() / calculatorRequest.getNumber2());
                break;
            default:
                throw new CalculatorException("not.valid.operation",calculatorRequest.getOperation());
        }
        return calculatorResponse;
    }
}
