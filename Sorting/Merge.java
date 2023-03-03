package Sorting;

public class Merge {
    static void merge(int[] array, int left, int mid, int right) {
        {
            // Find sizes of two subarrays to be merged
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int Left[] = new int[n1];
            int Right[] = new int[n2];

            // Copy data to temp arrays
            for (int iterator = 0; iterator < n1; ++iterator)
                Left[iterator] = array[left + iterator];

            for (int iterator = 0; iterator < n2; ++iterator)
                Right[iterator] = array[mid + 1 + iterator];

            int i = 0, j = 0;

            int k = left;
            while (i < n1 && j < n2) {
                if (Left[i] <= Right[j]) {
                    array[k] = Left[i];
                    i++;
                }
                else {
                    array[k] = Right[j];
                    j++;
                }
                k++;
            }

            // copying remaining elements of Left[] if remaining
            while (i < n1) {
                array[k] = Left[i];
                i++;
                k++;
            }

            // similarly for Right[]
            while (j < n2) {
                array[k] = Right[j];
                j++;
                k++;
            }
        }
    }

    static void sort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start+end)/2;
            sort(array, start, mid);
            sort(array, mid+1, end);

            merge(array, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {21, 35, -15, 7, 55, 1, -20};

        sort(array, 0, 6);

        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }
}
