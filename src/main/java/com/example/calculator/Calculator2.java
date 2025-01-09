package com.example.calculator;


import java.util.*;
//필드영역
public class Calculator2 {
    private int number1;
    private String Operation;
    private int number2;
    private boolean keepRunning;
    private List<Double> records = new ArrayList<>();

    //생성자 영역
    public Calculator2() {
        records = new ArrayList<>();
    }

    public Double calculate(int number1, String Operation, int number2) {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        double result = 0;

        switch (Operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                boolean keepRunning1 = keepRunning;
        }
        records.add(result);
            return result;
    }

    public List<Double> getRecords() {
        return records;
    }

    public void setRecords(Double records) {
        this.records.add(records);
        System.out.println("기록이 추가되었습니다.");
    }

    public void removeResult(List<Double> records) {
        records.remove(0);
        System.out.println("최종 연산 기록 :");
    }
}