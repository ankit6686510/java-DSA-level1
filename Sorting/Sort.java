package Sorting;

public class Sort {
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // int swap = 0; if the code is sorted it will check and will not further
            // itereate
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swap++;

                }

            }

        }
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;

                }

            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding correct postion to find insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void countingarray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }

        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 0, 1, 5, 0 };
        countingarray(arr);
        printarray(arr);
        // System.out.print(arr);
    }
}
