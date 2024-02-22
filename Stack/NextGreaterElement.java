package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
  public static int[] solve(int[] arr) {
    int[] nge = new int[arr.length];
    Stack<Integer> st = new Stack<>();

    nge[arr.length - 1] = -1;
    st.push(arr[arr.length - 1]);

    for (int i = arr.length - 2; i >= 0; i--) {
      while (!st.isEmpty() && arr[i] >= st.peek()) {// st.size()>0 && arr[i]>st.peek()
        st.pop();
      }

      if (st.isEmpty()) {
        nge[i] = -1;
      } else {
        nge[i] = st.peek();
      }

      st.push(arr[i]);
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
