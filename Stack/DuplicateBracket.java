package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println("Duplicate brackets found.");
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop(); // remove the '(' from stack
                }
            } else {
                st.push(ch);
            }
        }

        System.out.println("No duplicate brackets found.");
    }
}
