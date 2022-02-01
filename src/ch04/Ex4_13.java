package ch04;

public class Ex4_13 {
    public static void main(String[] args) {
        int i = 0, sum = 0;

        while (true){
            sum += ++i;
            if(sum > 100){
                break;
            }
        }

        System.out.println("i = "+ i);
        System.out.println("sum = "+ sum);
    }
}
