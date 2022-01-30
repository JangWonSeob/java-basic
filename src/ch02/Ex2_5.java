package ch02;

public class Ex2_5 {
    public static void main(String[] args) {
        // 정수/정수 = 정수 (정수 나누기 정수여서 결과가 정수이다.)
        System.out.println(10/3);
        System.out.println(10.0/3);

        // 지시자 - %.2f(소수점 2자리까지), %d(10진수), $X(16진수)
        System.out.printf("%.2f%n", 10.0/3);    // 3.33
        System.out.printf("%d%n", 0x1A);        // 26
        System.out.printf("%X%n", 0x1A);        // 1A
        // 개행문자(줄바꿈) - %n, %n(OS 관계없이 사용 가능)

        System.out.printf("%d%n", 15);      // 10진수
        System.out.printf("%o%n", 15);      // 8진수
        System.out.printf("%x%n", 15);      // 16진수
        System.out.printf("%s%n", Integer.toBinaryString(15));    // 2진수

        // 8진수, 16진수에 접두사 붙이기
        System.out.printf("%#o%n", 15);     // 017
        System.out.printf("%#x%n", 15);     // 0xf
        System.out.printf("%#X%n", 15);     // 0XF

        // 실수 출력 지시자 - %f(실수 표시), %e(지수형태가 유리할 때 사용), %g(간략한 형태)
        // float 보다 double 가 정밀도가 더 높다.
        float f = 123.456789f;
        System.out.printf("%f%n",f);    // 소수점 아래 6자리 - 123.456787(마지막 87은 의미x)
        System.out.printf("%e%n",f);
        System.out.printf("%g%n",f);

        System.out.printf("[%5d]%n", 10);
        System.out.printf("[%-5d]%n", 10);      // -를 사용하면 왼쪽 정렬
        System.out.printf("[%05d]%n", 10);
        System.out.printf("[%5d]%n", 1234567);  // 5자리를 지정해도 나머지 모두 출력

        // 정수 부분은 빈자리를 공백으로 채움, 소수 부분은 빈지라를 0으로 채움
        double d = 1.23456789;
        System.out.printf("%14.10f%n", d);    // 총 14자리 중 소수점 아래 10자리
        System.out.printf("%.6f%n", d);       // 소수점 아래 6자리

        String url = "www.naver.com";
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);     // 부분 출력(8자리만 출력)


    }
}
