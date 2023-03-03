package Sorting;

public class SelectionSort {
    static void sort1(int[] array) {

        for (int iterator = 0; iterator < array.length; iterator++) {
            int index = iterator;

            for (int iterator2 = iterator + 1; iterator2 < array.length; iterator2++) {

                if (array[iterator2] < array[index]) {
                    index = iterator2;
                }
            }

            int temp = array[index];
            array[index] = array[iterator];
            array[iterator] = temp;

        }
    }

    static void sort2(int[] array) {
        int temp;

        for (int iterator1 = 0; iterator1 < array.length; iterator1++) {

            for (int iterator2 = iterator1 + 1; iterator2 < array.length; iterator2++) {

                if (array[iterator1] > array[iterator2]) {

                    temp = array[iterator1];
                    array[iterator1] = array[iterator2];
                    array[iterator2] = temp;
                }
            }
        }
    }

    static void swap(int[] array, int iterator1, int iterator2) {
        int temp = array[iterator1];
        array[iterator1] = array[iterator2];
        array[iterator2] = temp;
    }
    
    public static void main(String[] args) {
        int[] array = {21, 35, -15, 7, 55, 1, -22};

        sort2(array);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
