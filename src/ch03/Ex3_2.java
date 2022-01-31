package ch03;

public class Ex3_2 {
    public static void main(String[] args){
        int a = 1_000_000;      // 1,000,000  1백만 = 10의 6제곱
        int b = 2_000_000;      // 2,000,000  2백만 = 10의 6제곱

//        long c = a * b;         // 결과값 = -1454759936 - int 타입의 범위 초과
        long c = (long)a * b; // a * b = 2,000,000,000,000

        System.out.println(c);
    }
}
