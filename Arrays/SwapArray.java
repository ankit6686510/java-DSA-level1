package Arrays;

public class SwapArray {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 33; // after swap a[0] = 32
        arr[1] = 56;
        arr[2] = 89;
        arr[3] = 899;
        arr[4] = 32; // after swap a[0] = 33
        swap(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
