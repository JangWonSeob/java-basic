package ch02;

import java.util.Scanner;

public class ScanfEx2_1 {
    public static void main(String[] args) {
        // System.in - 화면 입력
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();        // 정수
        System.out.println(num);

        String input = scanner.nextLine();      // 화면에서 입력된 내용을 input에 저장
        int num1 = Integer.parseInt(input);     // 문자열을 숫자로 변환
        System.out.println(num1);

    }
}
