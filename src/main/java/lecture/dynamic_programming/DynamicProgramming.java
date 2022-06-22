package lecture.dynamic_programming;

import java.util.Arrays;

public class DynamicProgramming {
    public static void main(String[] args) {
        int num = 5;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }
        System.out.println(Arrays.toString(arr));

        fibonacciRecursion(num);
        fibonacciDpMemoization(num, arr);
        fibonacciDpTabulation(num);

    }

    private static int fibonacciRecursion(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
        return 0;
    }

    private static int fibonacciDpTabulation(int num) {
        return 0;
    }
}
