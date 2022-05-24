package homework.stone_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {20, 333, 14, 1, 7};
        int[] array2 = {1, 2, 3};
        stoneSort(array1);
        stoneSort(array2);
    }

    private static void stoneSort(int[] array) {
        boolean isChange = false; // was there a change
        int temp; // temporary storage
        int countIter = 0; // how many times passed through the array
        while (!isChange) {
            isChange = true; // We assume the array is sorted
            for (int i = 0; i < array.length - 1; i++) { // array.length is 1 since we are comparing the i-th and i+1-th elements
                if (array[i] > array[i + 1]) {
                    isChange = false; // change happened, compare further
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    countIter++;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        System.out.println("were iterations: " + countIter);
    }
}