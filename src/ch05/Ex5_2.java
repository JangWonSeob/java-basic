package ch05;

public class Ex5_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

//        int[] score = {50, 60, 70, 80, 90};         // 정상

//        int[] score;
//        score = {50, 60, 70, 80, 90};               // 에러
//        score = new int[]{50, 60, 70, 80, 90};      // 정상

    }
}
