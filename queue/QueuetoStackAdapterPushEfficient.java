package queue;

import java.util.*;

public class QueuetoStackAdapterPushEfficient {

    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        void push(int val) {
            mainQ.add(val);
        }

        int pop() {
            if (size() == 0) {
                System.out.println("stack underflow");
                return -1;
            } else {
                while (mainQ.size() > 1) {
                    helperQ.add(mainQ.remove());
                }
                int val = mainQ.remove();
                while (!helperQ.isEmpty()) {
                    mainQ.add(helperQ.remove());
                }
                return val;
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("stack underflow");
                return -1;
            } else {
                while (mainQ.size() > 1) {
                    helperQ.add(mainQ.remove());
                }
                int val = mainQ.remove();
                helperQ.add(val);
                while (!helperQ.isEmpty()) {
                    mainQ.add(helperQ.remove());
                }
                mainQ.add(val); // Add the value back to mainQ to maintain the stack order.
                return val;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueToStackAdapter st = new QueueToStackAdapter();

        while (true) {
            String str = sc.nextLine();
            if (str.equals("quit")) {
                break;
            } else if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.equals("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.equals("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.equals("size")) {
                System.out.println(st.size());
            }
        }
    }
}
