package com.example.calculator;


import java.util.*;
//필드영역
public class Calculator2 {
    private int number1;
    private String Operation;
    private int number2;
    private boolean keepRunning;
    private List<String> records;

    //생성자 영역
    public Calculator2() {
        records = new ArrayList<>();
    }

    public int calculate(int number1, String Operation, int number2) {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        int result = 0;

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
        }
        records.add(number1+Operation+number2 + "=" + result );
            return result;
    }

    public List<String> getRecords() {
        return records;
    }
    public void setRecords(List<String> records) {
        this.records = records;
        System.out.println("기존 연산 기록" + records);
    }
    public void removeResult(List<String> records) {
        records.remove(0); //첫번쨰?

        System.out.println("최종 연산 기록");
    }
}