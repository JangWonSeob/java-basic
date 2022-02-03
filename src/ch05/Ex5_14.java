package ch05;

import java.util.Arrays;

public class Ex5_14 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 22}, {21, 22}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(str2D == str2D2);                    // false
        System.out.println(Arrays.deepEquals(str2D, str2D2));   // true

        int[] arr2 = Arrays.copyOf(arr, 7);
        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int[] intArr = {3, 2, 4, 1, 0};
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);                            // 오름차순 정렬
        System.out.println(Arrays.toString(intArr));
    }
}
