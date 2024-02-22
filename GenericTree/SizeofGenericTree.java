package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class SizeofGenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node){
        String str = node.data + "->";
        for(Node child: node.children){
            str += child.data + "->";
        }
        str += ".";
        System.out.println(str);

        for(Node child:node.children){
            display(child);
        }
    }

    public static int size(Node node){
        int s = 1; // Start with 1 for the current node

        for(Node child : node.children){
            s += size(child); // Accumulate the sizes of all children
        }

        return s;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        display(root);
        int treeSize = size(root);
        System.out.println("Size of the tree: " + treeSize);
    }
}
