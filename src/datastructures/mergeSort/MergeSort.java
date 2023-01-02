package datastructures.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0, a1 = 0, a2 = 0; i < array1.length + array2.length; i++) {
            if (a1 < array1.length && a2 < array2.length) {
                if (array1[a1] < array2[a2]) {
                    mergedArray[i] = array1[a1++];
                } else {
                    mergedArray[i] = array2[a2++];
                }
            } else {
                if (a1 < array1.length) {
                    mergedArray[i] = array1[a1++];
                }
                if (a2 < array2.length) {
                    mergedArray[i] = array2[a2++];
                }
            }
        }
        System.out.println("*****merge for: " + Arrays.toString(array1) + "  and   " + Arrays.toString(array2)
                + "   is = " + Arrays.toString(mergedArray));
        return mergedArray;
    }

    public static int[] mergeSort(int[] array) {

        System.out.println("mergeSort for: " + Arrays.toString(array));
        if (array.length == 1)
            return array;

        int midIndex = array.length / 2;
        int[] array1 = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] array2 = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(array1, array2);

    }

    public static void main(String[] args) {
        int[] array1 = { 1, 5, 9, 53 };
        int[] array2 = { 4, 98, 200, 5, 34, 1 };

        int[] a1 = { 4 };
        int[] a2 = { 98, 200 };

        System.out.println("-----------------merge-------------------");
        System.out.println(Arrays.toString(merge(a1, a2)));
        System.out.println(Arrays.toString(merge(array1, array2)));

        System.out.println("-----------------mergeSort-------------------");
        System.out.println(Arrays.toString(mergeSort(array2)));
    }
}
