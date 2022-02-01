package ch04;

import java.util.Scanner;

public class Ex4_11 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while (num > 0){
            sum += num % 10;
            System.out.println("sum = " + sum + " num = " + num);
            num = num / 10;
        }

        System.out.println("각 자리수의 합은 " + sum);
    }
}
