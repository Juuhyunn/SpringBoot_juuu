package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

public interface CalculatorService {
    int add(CalculatorDTO calculatorDTO);
    int subtract(CalculatorDTO calculatorDTO);
    int multiple(CalculatorDTO calculatorDTO);
    int divide(CalculatorDTO calculatorDTO);
    int remind(CalculatorDTO calculatorDTO);
    int calc(CalculatorDTO calculatorDTO);
    String toString(CalculatorDTO calculatorDTO);
}
