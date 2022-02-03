package ch05;

public class Ex5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("================================");

        for(int i = 0; i < score.length; i++){
            int total = 0;
            float avg = 0;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.print(i+1);

            for(int j = 0; j < score[i].length; j++){
                total += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            avg = total/(float)(score[i].length);

            System.out.printf("%5d %5f%n", total, avg);
        }
        System.out.println("================================");
        System.out.printf("총점 : %3d %3d %3d", korTotal, engTotal, mathTotal);
    }
}
