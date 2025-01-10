package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        Double result = (double) 0;

 //result 선언
        /* 반복문 시작 */
        while(keepRunning) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int number1 = sc.nextInt();
            if (number1 < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char Operation = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요:");
            int number2 = sc.nextInt();
            if (number2 < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

//ca2 -class calculate 호출 --> result

            result = calculator.calculate(number1, Operation, number2);

            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String reply = sc.next();

        if (reply.equalsIgnoreCase("exit")) {
            keepRunning = false;
            break;
        }
    }
        System.out.println("전체 연산 기록 :" + calculator.getRecords()); // 전체 연산기록 출력
        System.out.println("첫 번째 연산 기록을 삭제합니다."); // 문제요구사항

        calculator.removeResult(calculator.getRecords());
        System.out.println(calculator.getRecords());

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}


