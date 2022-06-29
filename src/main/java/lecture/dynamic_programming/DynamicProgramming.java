package lecture.dynamic_programming;


import java.util.Arrays;

public class DynamicProgramming {
    public static void main(String[] args) {

        int num = 1000;
        int[] arr = new int[num + 1];
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }

//        System.out.println(fibonacciRecursion(num));
//
//        System.out.println(fibonacciDpMemoization(num, arr));
//
//        System.out.println(fibonacciDpTabulation(num));

        long time = System.nanoTime();
//        fibonacciRecursion(num);
//        System.out.println("rec = " + (System.currentTimeMillis() - time));
        time = System.nanoTime();
        fibonacciDpMemoization(num, arr);
        System.out.println("mem = " + (System.nanoTime() - time));
        time = System.nanoTime();
        fibonacciDpTabulation(num);
        System.out.println("tab = " + (System.nanoTime() - time));

    }

    private static int fibonacciRecursion(int num) {
//        if (num < 2) {
//            return 1;
//        }
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
//        if (num < 2) {
//            return 1;
//        }
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        if(arr[num] != -1) {
            return arr[num];
        }

        arr[num] = fibonacciDpMemoization(num - 1, arr) + fibonacciDpMemoization(num - 2, arr);
//        System.out.println(Arrays.toString(arr));
        return arr[num];
    }

    private static int fibonacciDpTabulation(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;

        int res = 0;

        for (int index = 2; index <= num; index++) {
            arr[index] = arr[index - 2] + arr[index - 1];

            if (index == num) {
                res = arr[index];
            }
        }
//        System.out.println(Arrays.toString(arr));
        return res;
    }
}
