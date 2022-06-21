package lecture.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]) {
        /*
        mergeSort(arr, leftIndex, rightIndex) - function that sorts arr[leftIndex..rightIndex] using merge()
        merge(arr, leftIndex, mediumIndex, rightIndex) - Merges two subarrays of arr[].
            First subarray is arr[leftIndex..mediumIndex] Second subarray is arr[mediumIndex+1..rightIndex]
        printArray(arr) - A utility function to print array
         */

        int arr[] = {15, 21, 13, 5, 10, 7};
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        System.out.println("Given Array");
        printArray(arr);

        mergeSort(arr, leftIndex, rightIndex);

        System.out.println("Sorted array");
        printArray(arr);
    }

    public static void mergeSort(int arr[], int leftIndex, int rightIndex) {
        System.out.println("Sort " + leftIndex + ".." + rightIndex);

        if (leftIndex == rightIndex) {
            return;
        }

        // Find the middle point
        int mediumIndex = leftIndex + (rightIndex - leftIndex) / 2;

        // Sort first and second halves
        mergeSort(arr, leftIndex, mediumIndex);
        mergeSort(arr, mediumIndex + 1, rightIndex);

        // Merge the sorted halves
        merge(arr, leftIndex, mediumIndex, rightIndex);

    }

    private static void merge(int arr[], int leftIndex, int mediumIndex, int rightIndex) {
        // Find sizes of two subarrays to be merged
        int leftSizeArr = mediumIndex - leftIndex + 1;
        int rightSizeArr = rightIndex - mediumIndex;

        // Create temp arrays
        int leftArray[] = new int[leftSizeArr];
        int rightArray[] = new int[rightSizeArr];

        // Copy data to temp arrays
        for (int i = 0; i < leftSizeArr; ++i) {
            leftArray[i] = arr[leftIndex + i];
        }
        for (int j = 0; j < rightSizeArr; ++j) {
            rightArray[j] = arr[mediumIndex + 1 + j];
        }

        /* Merge the temp arrays */

        // InitialeftIndexindexes of first and second subarrays
        int i = 0, j = 0;

        // InitialeftIndexindex of merged subarray array
        int k = leftIndex;
        while (i < leftSizeArr && j < rightSizeArr) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of leftArray[] if any */
        while (i < leftSizeArr) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of rightArray[] if any */
        while (j < rightSizeArr) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
