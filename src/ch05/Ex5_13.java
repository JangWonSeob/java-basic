package ch05;

import java.util.Arrays;

public class Ex5_13 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2 = [0, 1, 2, 3, 4]
        int[] arr3 = Arrays.copyOf(arr, 3); // arr3 = [0, 1, 2]
        int[] arr4 = Arrays.copyOf(arr, 7); // arr4 = [2, 3]
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr5 = [2, 3]
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr6 = [0, 1, 2, 3, 4, 0, 0]
    }
}
