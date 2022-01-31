package ch03;

public class Ex3_1 {
    public static void main(String[] args){
        int i = 5, j = 0;

        j = i++;        // 후위형
        // 위와 동일
//        j = i;
//        i++;
        System.out.println("j=i++; 실행 후 , i= " + i +", j= " + j );

        i = 5;
        j = 0;

        j = ++i;        // 전위형
        // 위와 동일
//        ++i;
//        j = i;
        System.out.println("j=++i; 실행 후 , i= " + i +", j= " + j );
    }
}
