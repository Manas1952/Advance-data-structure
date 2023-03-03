package Searching;

public class Binary {
    static void search(int[] array, int value, int left, int right) {
        if (left > right) {
            System.out.println("not found");
            return;
        }

        int mid = (left + right) / 2;

        if (array[mid] == value) {
            System.out.println("found at " + mid);
        }
        else if (value < array[mid]) {
            search(array, value, left, mid - 1);
        }
        else if (value > array[mid]) {
            search(array, value, mid + 1, right);
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        search(array, 4, 0, array.length-1);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
