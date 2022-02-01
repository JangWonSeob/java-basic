package ch04;

public class Ex4_10 {
    public static void main(String[] args) {
        int i = 0, sum = 0;

        while (sum <= 100){
            System.out.printf("1부터 %d까지의 합은 %d%n", i, sum);
            sum += ++i;
        }
    }
}
