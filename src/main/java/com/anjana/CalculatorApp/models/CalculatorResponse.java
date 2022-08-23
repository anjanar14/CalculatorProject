package com.anjana.CalculatorApp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculatorResponse {

    private String operation;
    private Double number1;
    private Double number2;
    private Double result;
}
