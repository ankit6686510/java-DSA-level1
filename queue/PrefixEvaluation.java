package queue;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String exp = "-+2/*6483";
        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                String pov1 = ps.pop();
                String pov2 = ps.pop();
                ps.push(pov1 + pov2 + ch);

            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }

        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    public static int operation(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;

        } else if (op == '-') {
            return v1 - v2;

        } else if (op == '*') {
            return v1 * v2;

        } else {
            return v1 / v2;
        }
    }
}
