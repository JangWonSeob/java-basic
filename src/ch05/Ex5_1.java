package ch05;

import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
//        int[] score;        // 1. 배열 score 를 선언(참조변수)
//        score = new int[5]; // 2. 배열의 생성(int 저장공간 x 5)

        int[] score = new int[5];
        score[3] = 100;

        System.out.println(Arrays.toString(score));
    }
}
