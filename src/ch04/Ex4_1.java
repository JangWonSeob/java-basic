package ch04;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args){
        int score = 0;
        char grade = 'D';

        System.out.println("점수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >= 90){
            grade = 'A';
        } else if(score >= 80){
            grade = 'B';
        } else if(score >= 70){
            grade = 'C';
        }
        // 생략 가능(리팩토링 측면에서 else 문은 쓰지 않는게 좋다.)
//        else {
//            grade = 'D';
//        }
        System.out.println("당신의 학점은" + grade + "입니다.");

    }
}
