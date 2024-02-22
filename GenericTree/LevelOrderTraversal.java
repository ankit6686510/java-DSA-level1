package GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void traversal(Node node) {
        // Euler's left on the way deep in the recursion node's pre area
        System.out.println("Node pre: " + node.data);
        for (Node child : node.children) {
            System.out.println("Edge pre: " + node.data + " -- " + child.data);
            traversal(child);
            System.out.println("Edge post: " + node.data + " -- " + child.data);
        }
        // Euler's right on the way out of recursion, node's post area
        System.out.println("Node post: " + node.data);
    }
    public static void levelorder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while (q.size()>0) {
            node = q.remove();
            System.out.print(node.data +" ");
            
            for(Node child :node.children){
                q.add(child);
            }
            
        }
        System.out.print(".");

    
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

        // Display the traversal of the tree
        // System.out.println("The traversal of the tree is:");
        // traversal(root);
        System.out.print("The level order traversal of the tree is:");
        levelorder(root);
    }
}
