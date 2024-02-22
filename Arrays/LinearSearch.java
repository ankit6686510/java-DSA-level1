package Arrays;

public class LinearSearch {
    public static int linearsearch(int num[], int key) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 20, 4, 60, 8, 1, 120, 10 };
        int key = 10;
        int index = linearsearch(num, key);
        if (index == -1) {
            System.out.println("not found");

        } else {
            System.out.println("key is at index : " + index);

        }
    }
}
