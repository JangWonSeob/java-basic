package ch06;

public class Ex6_1 {
    public static void main(String[] args){
        Tv tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널은 " + tv.channel + "입니다");
    }
}
class Tv{
    // TV 의 속성(멤버변수)
    String color;       // 색상
    boolean power;      // 전원 상태
    int channel;        // 채널

    void power(){ power = !power; }
    void channelUp() { ++channel;}
    void channelDown() { --channel;}
}
