package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuilddDynamicStack {
    public static class CustomStack {
        int[] data; // Integer array to store stack elements
        int tos; // Top of the stack index

        public CustomStack(int cap) {
            data = new int[cap]; // Initialize the data array with the given capacity
            tos = -1; // Initialize top of the stack as -1 (empty stack)
        }

        int size() {
            return tos + 1; // Return the number of elements in the stack (index + 1)
        }

        void display() {
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " "); // Display elements from top to bottom
            }
            System.out.println(); // Print a new line after displaying all elements
        }

        void push(int val) {
            if (tos == data.length - 1) {
                // If the stack is full, double its capacity
                int[] ndta = new int[2 * data.length]; // Create a new array with double capacity
                for (int i = 0; i <= tos; i++) {
                    ndta[i] = data[i]; // Copy data from the old array to the new array
                }
                data = ndta; // Update the reference to the new array
            }
            tos++;
            data[tos] = val; // Increment the top and add the new value to the stack
        }

        int pop() {
            if (tos == -1) {
                System.out.println("stack underflow"); // If the stack is empty, print an error message
                return -1; // Return -1 to indicate stack underflow
            } else {
                int val = data[tos]; // Get the top element
                tos--; // Decrement the top index to remove the top element
                return val; // Return the removed element
            }
        }

        int top() {
            if (tos == -1) {
                System.out.println("stack underflow"); // If the stack is empty, print an error message
                return -1; // Return -1 to indicate stack underflow
            } else {
                return data[tos]; // Return the top element without removing it
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // Read the initial stack capacity
        CustomStack st = new CustomStack(n); // Create a new custom stack with the given capacity

        String str = br.readLine(); // Read the first input string
        while (!str.equals("quit")) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val); // Push the specified value onto the stack
            } else if (str.startsWith("pop")) {
                int val = st.pop(); // Pop the top element from the stack
                if (val != -1) {
                    System.out.println(val); // Print the popped value if it's not -1 (stack not empty)
                }
            } else if (str.startsWith("top")) {
                int val = st.top(); // Get the top element without popping it
                if (val != -1) {
                    System.out.println(val); // Print the top element if it's not -1 (stack not empty)
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size()); // Print the current size of the stack
            } else if (str.startsWith("display")) {
                st.display(); // Display all elements in the stack from top to bottom
            }
            str = br.readLine(); // Read the next input string
        }
    }
}
