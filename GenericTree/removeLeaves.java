package GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class removeLeaves {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

   
    // public static void levelorder(Node node){
    //     Queue<Node> q = new ArrayDeque<>();
    //     q.add(node);

    //     while (q.size()>0) {
    //         node = q.remove();
    //         System.out.print(node.data +" ");
            
    //         for(Node child :node.children){
    //             q.add(child);
    //         }
            
    //     }
    //     System.out.print(".");

    
    // }
    // public static void levelorderlinewise(Node node) {
    //     // Main queue to store nodes of the current level
    //     Queue<Node> mq = new ArrayDeque<>();
    //     mq.add(node);
    
    //     // Child queue to store nodes of the next level
    //     Queue<Node> cq = new ArrayDeque<>();
    
    //     // Continue the level-order traversal until the main queue is empty
    //     while (mq.size() > 0) {
    //         // Dequeue a node from the main queue
    //         node = mq.remove();
    
    //         // Print the data of the dequeued node (on the same line)
    //         System.out.print(node.data + " ");
    
    //         // Enqueue all children of the dequeued node into the child queue
    //         for (Node child : node.children) {
    //             cq.add(child);
    //         }
    
    //         // Check if the main queue is empty (current level is processed)
    //         if (mq.size() == 0) {
    //             // Swap main and child queues
    //             mq = cq;
    //             cq = new ArrayDeque<>();
    
    //             // Move to the next line to start a new level
    //             System.out.println();
    //         }
    //     }
    // }
    public static void removeLeaf(Node node){
        for(int i = node.children.size()-1; i>=0 ;i--){
            Node child = node.children.get(i);
            if(child.children.size()==0){
                node.children.remove(child);
            }
        }
        for(Node child : node.children){
            removeLeaf(child);
        }

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
        // System.out.print("The level order traversal of the tree is:");
        // levelorder(root);
        System.out.print("After removing leaves from tree is:");
        removeLeaf(root);
    }
}
