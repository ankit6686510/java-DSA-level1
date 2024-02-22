package Stack;

import java.util.Stack;

public class alternatrapprNGE {
    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0; i < nge.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();

            }
            st.push(i);

        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();

        }
        return nge;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] result = solve(arr);

        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
