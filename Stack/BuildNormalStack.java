package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuildNormalStack {
    public static class CustomStack { // Renamed the class to match its declaration
        int[] data;
        int tos; // top of stack

        public CustomStack(int cap) { // Renamed the constructor
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return tos + 1;
        }

        void display() {
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " "); // Changed "println" to "print" for displaying elements on the same
                                                 // line
            }
            System.out.println();
        }

        void push(int val) {
            if (tos == data.length - 1) {
                System.out.println("stack overflow");
            } else {
                tos++;
                data[tos] = val; // Receiving the value
            }
        }

        int pop() {
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            } else {
                int val = data[tos]; // Receiving the tos
                tos--;
                return val;
            }
        }

        int top() { // Added a top method to view the top element without popping
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            } else {
                return data[tos];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);

        String str = br.readLine();
        while (!str.equals("quit")) { // Simplified the condition
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("display")) {
                st.display();
            }
            str = br.readLine();
        }
    }
}
