package com.example.demo.math.Controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculatorDTO = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("첫 번째 숫자는?");
        calculatorDTO.setNum1(scanner.nextInt());
        System.out.println(calculatorDTO.getNum1());
        System.out.println("연산자는?");
        calculatorDTO.setOpcode(scanner.next());
        System.out.println(calculatorDTO.getOpcode());
        System.out.println("두 번째 숫자는?");
        calculatorDTO.setNum2(scanner.nextInt());
        System.out.println(calculatorDTO.getNum2());
        calculatorService.calc(calculatorDTO);
        System.out.println(calculatorDTO.getResult());
        //System.out.println(calculatorService.toString());
        //System.out.printf("%d %s %d = %d", calculatorDTO.getNum1(), calculatorDTO.getOpcode(),calculatorDTO.getNum2(),calculatorDTO.getResult());
    }
}
