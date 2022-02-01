package ch04;

public class Ex4_14 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                // 아래 내용을 건너뛴다.
                continue;
            System.out.println(i);
        }
    }
}
