package Sorting;

public class Insertion {
    static void insertion(int[] array) {
        int iterator1, iterator2, temp;
        for (iterator1 = 1; iterator1 < array.length; iterator1++) {
            temp = array[iterator1];
            iterator2 = iterator1 - 1;

            while (iterator2 >= 0 && temp <= array[iterator2]) {
                array[iterator2 + 1] = array[iterator2];

                iterator2--;
            }
            array[iterator2+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {21, 35, -15, 7, 55, 1, -20};

        insertion(array);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
