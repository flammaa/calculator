//1. **요구사항 정의**
//    - 어떤 계산기 기능이 필요한지 명확히 합니다.
//    - 예를 들어, 기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈), 괄호 사용, 제곱근, 제곱 등.
//    - 사용자 인터페이스 방식 결정 : 콘솔 기반인지, GUI(그래픽 사용자 인터페이스) 기반인지.
//    - 예외 처리 : 0으로 나누기와 같은 오류를 어떻게 처리할지 결정합니다.
//2. **설계**
//    - 클래스 다이어그램: 계산기에 필요한 클래스를 설계합니다. 예를 들어, Calculator, Operation, Parser 등이 될 수 있습니다.
//    - 기능 분해: 주요 기능을 메소드로 분리합니다. 예를 들어, add(), subtract(), multiply(), divide(), evaluateExpression() 등.
//    - 데이터 흐름 설계: 데이터가 클래스 간에 어떻게 흐를지를 결정합니다.
//    입력, 처리, 출력의 흐름을 이해합니다.



package com.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while(keepRunning) {
            System.out.println("첫 번째 정수를 입력하세요: ");
            int number1 = sc.nextInt();
            if (number1 < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }
            System.out.println("원하는 사칙연산 기호를 입력하세요(+, -, *, /): ");
             char Operation = sc.next().charAt(0);

            System.out.println("두 번째 정수를 입력하세요: ");
            int number2 = sc.nextInt();

            if (number2 < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            double result = 0;

            switch (Operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 != 0) {
                        result = (double) number1 / number2;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                default:
                    throw new IllegalArgumentException("사칙연산 기호는 +, -, *, / 중 하나여야 합니다.");
        }
        System.out.println("결과: " + result);
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        String reply = sc.next();
            if ("exit".equals(reply)) {
            keepRunning = false;
        }
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}
