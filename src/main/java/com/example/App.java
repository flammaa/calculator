package com.example;

import com.example.calculator.Calculator2;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        int result;

 //result 선언
        /* 반복문 시작 */
        while(keepRunning) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int number1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            String Operation = sc.next();

            System.out.print("두 번째 숫자를 입력하세요:");
            int number2 = sc.nextInt();

//ca2 -class calculate 호출 --> result

            result = calculator.calculate(number1, Operation, number2);
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String reply = sc.next();

            if (reply == "exit") {
                keepRunning = false;
            }
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}