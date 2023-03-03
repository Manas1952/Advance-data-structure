package Sorting;

public class Quick {
    static void sort(int[]array, int start, int end) {
        if (start < end) {
            int part = partition(array, start, end);
            sort(array, start, part-1);
            sort(array, part+1, end);
        }
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int iterator1= start -1;
        for (int iterator2 = start; iterator2 < end; iterator2++) {
            if (array[iterator2] < pivot) {
                iterator1++;

                // swapping
                int temp = array[iterator1];
                array[iterator1] = array[iterator2];
                array[iterator2] = temp;
            }
        }
        int temp = array[iterator1+1];

        array[iterator1+1] = array[end];

        array[end] = temp;

        return iterator1+1;
    }

    public static void main(String[] args) {

        int[] array = {21, 35, -15, 7, 55, 1, -20};

        sort(array, 0, array.length-1);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
