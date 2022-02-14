package ch06;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        System.out.println("tv1의 현재 채널은 " + tv1.channel + "입니다");
        System.out.println("tv2의 현재 채널은 " + tv2.channel + "입니다");

        tv1.channel = 7;
        System.out.println("tv1의 channel값을 7로 변경하였습니다.");

        System.out.println("tv1의 현재 채널은 " + tv1.channel + "입니다");
        System.out.println("tv2의 현재 채널은 " + tv2.channel + "입니다");

        tv2 = tv1;
        System.out.println("tv1의 현재 채널은 " + tv1.channel + "입니다");
        System.out.println("tv2의 현재 채널은 " + tv2.channel + "입니다");

    }
}

