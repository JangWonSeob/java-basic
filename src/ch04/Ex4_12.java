package ch04;

import java.util.Scanner;

public class Ex4_12 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        Scanner scanner = new Scanner(System.in);
        answer = (int)(Math.random() * 100) + 1;
        System.out.println("answer = " + answer);

        do {
            input = scanner.nextInt();
            if(input > answer){
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if(input < answer){
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        }while (input != answer);

        System.out.println("정답입니다.");
    }
}
