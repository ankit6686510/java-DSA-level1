package GenericTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class mirrorGenricTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){ //creating a costructor

        }
        Node(int data){//paramatrized contsructor dete hi defualt contsructor remove ho jaata hai
            this.data = data;
        }
    }
    public static void mirror(Node node){
        for(Node child : node.children){
            mirror(child);
        }
        Collections.reverse(node.children);
    }
    // Add this method to update the children references in the parent nodes
public static void updateChildrenReferences(Node node) {
    for (Node child : node.children) {
        updateChildrenReferences(child);
    }
    for (Node child : node.children) {
        child.children.add(node);
    }
    node.children.clear();
}

    public static void main(String[] args) {
        int[] arr = {10, 20, 30,  40,  50, 60,70,80,  90, 100,110,120};
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

        
        
        System.out.print("The mirror of the tree is:");
        mirror(root);

         // Add this line to update children references in the mirrored tree
    updateChildrenReferences(root);
    }
    
}
