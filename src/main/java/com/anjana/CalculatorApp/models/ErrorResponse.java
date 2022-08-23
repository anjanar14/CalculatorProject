package com.anjana.CalculatorApp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Getter
public class ErrorResponse {

    @JsonProperty("http_code")
    private int httpCode;

//    @JsonProperty("message")
    private String message;
}
