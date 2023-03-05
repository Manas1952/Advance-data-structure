package HashTables;

import java.util.*;

public class BucketSort {
    static void bucketSort(int[] array) {
        List<Integer>[] lists = new List[10];

        for (int iterator = 0; iterator < lists.length; iterator++) {
            lists[iterator] = new ArrayList<Integer>();
        }

        for (int iterator = 0; iterator < array.length; iterator++) {
            lists[hash(array[iterator])].add(array[iterator]);
        }

        for (List list: lists) {
            Collections.sort(list);
        }

        int j = 0;
        for (int iterator = 0; iterator < lists.length; iterator++) {
            for (int value: lists[iterator]) {
                array[j++] = value;
            }
        }
    }

    static int hash(int value) {
        return value / 10;
    }
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1, 55, 44, 43, 42, 43, 11};

        bucketSort(array);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
