package ch02;

public class Ex2_6 {
    public static void main(String[] args) {
        String str = "3";
        // '3'(유니코드 51) - '0'(유니코드 48) ->
        System.out.println('3' - '0');              // 정수 3으로 바뀜
        System.out.println(str.charAt(0) - '0');    // 위와 동일
        System.out.println('3' - '0' + 1);          // 정수 3 + 1
        System.out.println(Integer.parseInt("3") + 1);
        System.out.println("3" + "1");
        System.out.println(3 + '0');                // '0'은 숫자 48
        System.out.println((char) (3 + '0'));       // 정수 3
    }
}
