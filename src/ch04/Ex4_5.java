package ch04;

public class Ex4_5 {
    public static void main(String[] args) {
        // scope - 변수의 범위(선언된 위치부터 블럭이 끝나는 부분까지)
        // scope 는 범위가 작을수록 좋다.

        for(int i = 0; i < 3; i++){
            System.out.println("Hello");
        }

        for(int i = 1; i <= 10; i = i *2){
            System.out.println("Hello2");
        }

        for(int i = 1, j = 10; i <= 10; i++, j--){
            System.out.println("i=" + i + " j=" + j);
        }

        // 조건식을 생략하면, true로 간주되어서 무한반복문이 된다.
//        for(;;){
//            System.out.println("true");
//        }
//        for(;true;){
//            System.out.println("true");
//        }
    }
}
