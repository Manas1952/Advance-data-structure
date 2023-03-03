package Sorting;

public class BubbleSort {
    static void sort(int[] array) {
        for (int iterator1 = 0; iterator1 < array.length; iterator1++) {

            for (int iterator2 = 1; iterator2 < array.length - iterator1; iterator2++) {

                if (array[iterator2-1] > array[iterator2]) {
                    swap(array, iterator2-1);
                }
            }
        }
    }

    static void swap(int[] array, int iterator) {
        int temp = array[iterator];
        array[iterator] = array[iterator+1];
        array[iterator+1] = temp;
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        sort(array);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
