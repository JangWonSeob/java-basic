package ch06;

public class Ex6_6 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();


    }
}

class Data_1 {
    int value;

    // 생성자를 추가하지 않을 경우 기본 생성자를 만들어준다.
    Data_1() {}
}

class Data_2 {
    int value;

    Data_2() {}

    // 생성자를 추가한 경우 기본 생성자를 추가해주어야 한다.
    Data_2(int x) {
        value = x;
    }
}