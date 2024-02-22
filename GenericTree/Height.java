package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Height {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // public static void display(Node node){
    //     String str = node.data + "->";
    //     for(Node child: node.children){
    //         str += child.data + "->";
    //     }
    //     str += ".";
    //     System.out.println(str);

    //     for(Node child:node.children){
    //         display(child);
    //     }
    // }

    // public static int size(Node node){
    //     int s = 1; // Start with 1 for the current node

    //     for(Node child : node.children){
    //         s += size(child); // Accumulate the sizes of all children
    //     }

    //     return s;
    // }
    // public static int findmax(Node node){
    //     int max = Integer.MIN_VALUE;
    //     if(node.data>max){ //checking value of current node
    //         max =  node.data;
    //     }
    //     for(Node child: node.children){
    //         int childmax = findmax(child);
        
    //     //updating maximum if the maximum in child is greater
    //     if(childmax > max){
    //         max = childmax;
    //     }
    // }
    //     return max;
    // }
    public static int height(Node node) {
        int ht = -1;
        for (Node child : node.children) {
            int ch = height(child);
            ht = Math.max(ch, ht);
        }
        ht += 1; // Add 1 to account for the current level
        return ht;
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

        //display(root);
        // int treeSize = size(root);
        // System.out.println("Size of the tree: " + treeSize);
        System.out.println("the height of tree is:" +height(root));
    }
}
