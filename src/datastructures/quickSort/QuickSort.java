package datastructures.quickSort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void quickSort(int[] array, int left, int right) {

        if (right > left) {
            int pivotIndex = pivot(array, left, right);
            System.out.println("pivotIndex is " + pivotIndex + "  left is " + left + " right is " + right
                    + " for array: " + Arrays.toString(array));

            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] array = { 4, 6, 1, 7, 3, 2, 5 };

        System.out.println("-----------------------pivot-----------");
        System.out.println("swap is " + pivot(array, 0, 6));
        System.out.println("array is " + Arrays.toString(array));

        System.out.println("-----------------------quickSort-----------");
        int[] array2 = { 4, 6, 1, 7, 3, 2, 5 };
        quickSort(array2, 0, 6);
        System.out.println("array is " + Arrays.toString(array2));

    }

}
