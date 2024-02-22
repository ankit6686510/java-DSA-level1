package Stack;

import java.util.Stack;

public class infixConversion {
    public static void main(String[] args) {
        String exp = "a*(b-c)/d+e";

        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i); // Corrected the typo charat to charAt

            if (ch == '(') {
                ops.push(ch);
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();
                    process(op, postfix, prefix); // Call the process function with the operator
                }
                ops.pop(); // Popping the '('
            } else if ((ch >= '0' && ch <= '9') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else { // Changed 'else if' to 'else' here
                while (!ops.isEmpty() && ops.peek() != '(' &&
                        precedence(ch) <= precedence(ops.peek())) {
                    char op = ops.pop();
                    process(op, postfix, prefix); // Call the process function with the operator
                }
                ops.push(ch); // Pushing your current operator
            }
        }

        while (!ops.isEmpty()) {
            char op = ops.pop();
            process(op, postfix, prefix); // Call the process function with the operator
        }

        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    public static void process(char op, Stack<String> postfix, Stack<String> prefix) {
        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push(postv);

        String prev2 = prefix.pop();
        String prevv1 = prefix.pop();
        String prevv = op + prevv1 + prev2;
        prefix.push(prevv); // Corrected the variable name from prev to prevv
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
