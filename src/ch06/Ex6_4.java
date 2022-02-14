package ch06;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long a = 5L, b = 3L;
        long result1 = mm.add(a, b);
        long result2 = mm.subtract(a, b);
        long result3 = mm.multiply(a, b);
        double result4 = mm.divide(a, b);
        mm.printGugudan(12);

        System.out.println("5L + 3L = " + result1);
        System.out.println("5L - 3L = " + result2);
        System.out.println("5L * 3L = " + result3);
        System.out.println("5L / 3L = " + result4);
    }
}

class MyMath {
    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {  // 입력 받은 단(dan)이 2~9가 아니면 종료
            return;
        }
        for (int i = 1; i < 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
    }

    long max(long a, long b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

