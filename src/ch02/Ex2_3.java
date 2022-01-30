package ch02;

public class Ex2_3 {
    public static void main(String[] args) {

        final int score = 100;
//        score = 200;
        System.out.println(score);

        boolean power = false;
        System.out.println(power);

        byte b = 127; // -128~127
        System.out.println(b);

        int oct = 010; // 8진수 - 8
        int hex = 0x10; // 16진수 - 16
        System.out.println(oct);
        System.out.println(hex);


        long l = 10_000_000_000L;
        System.out.println(l);

        float f = 3.14f;
        double d = 3.14;
        System.out.println(f);
        System.out.println(d);

    }
}
