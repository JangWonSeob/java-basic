package ch04;

public class Ex4_4 {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            // 1<= x <= 10 (1 ~ 10)
//            System.out.println((int)(Math.random() * 10) + 1);

            // -5<= x <= 5 (-5 ~ 5)
            System.out.println((int)(Math.random() * 11) - 5);
        }
    }
}
