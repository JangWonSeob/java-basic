package ch05;

public class Ex5_12 {
    public static void main(String[] args) {
        //            01234
        String str = "ABCDE";
        char ch = str.charAt(4);            // E
        String str2 = str.substring(1, 4);   // BCD  (1~3)
        String str3 = str.substring(1, 5);   // BCDE (1~4)
        String str4 = str.substring(1, str.length());   // BCDE (1~4)
        System.out.println(str3);
        System.out.println(str4);
    }
}
