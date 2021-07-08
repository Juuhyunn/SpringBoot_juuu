package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int add(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() - calculatorDTO.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() * calculatorDTO.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() / calculatorDTO.getNum2();
    }

    @Override
    public int remind(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() % calculatorDTO.getNum2();
    }

    @Override
    public int calc(CalculatorDTO calculatorDTO) {
        switch (calculatorDTO.getOpcode()) {
            case "+" :
                System.out.println("연산 성공 +");
                calculatorDTO.setResult(add(calculatorDTO));
                break;
            case "-" :
                System.out.println("연산 성공 -");
                calculatorDTO.setResult(subtract(calculatorDTO));
                break;
            case "*" :
                System.out.println("연산 성공 *");
                calculatorDTO.setResult(multiple(calculatorDTO));
                break;
            case "/" :
                System.out.println("연산 성공 /");
                calculatorDTO.setResult(divide(calculatorDTO));
                break;
            case "%" :
                System.out.println("연산 성공 %");
                calculatorDTO.setResult(remind(calculatorDTO));
                break;
        }
        return calculatorDTO.getResult();
    }
    @Override
    public String toString(CalculatorDTO calculatorDTO) {
        return String.format("%d %s %d = %d",calculatorDTO.getNum1(),calculatorDTO.getOpcode(),calculatorDTO.getNum2(),calculatorDTO.getResult());
    }
}
