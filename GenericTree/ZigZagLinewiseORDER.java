package GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagLinewiseORDER {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){ //creating a costructor

        }
        Node(int data){//paramatrized contsructor dete hi defualt contsructor remove ho jaata hai
            this.data = data;
        }
    }

   
    
    public static void levelorderLinewisezz(Node node) {
        Stack<Node> ms = new Stack<>();
        ms.push(node);
        Stack<Node> cs = new Stack<>();
        int level = 1;

        while (ms.size() > 0) {
            node = ms.pop();
            System.out.println(node.data + " ");

            if (level % 2 == 1) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            }

            if (ms.size() == 0) {
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }
    public static void anotermenthodofZZ(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        mq.add(new Node(-1));

        while (mq.size()>0) {
            node = mq.remove();
            if(node.data != -1){
                System.out.println(node.data +"");
                for(Node child:node.children){
                    mq.add(child);
                    
                }
            }else{
                if(mq.size()>0){
                    mq.add(new Node(-1));
                    System.out.println();
                }
            }
            
        }
    }
    public static void levelorderlinewisezz3(Node node){

    Queue<Node> mq = new ArrayDeque<>();
    mq.add(node);
    while (mq.size()>0) {
        int circl = mq.size();

        for(int i =0;i<circl;i++){
            node = mq.remove();
            System.out.print(node.data + "");

            for(Node child:node.children){
                mq.add(child);

            }
        }System.out.println();
        
    }

  }
  private static class pair {
    Node node;
    int level;

    pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

public static void levelorderLineWiseZZ4(Node node) {
    Queue<pair> mq = new ArrayDeque<>();
    mq.add(new pair(node, 1));

    int level = 1;
    while (mq.size() > 0) {
        pair p = mq.remove();
        if (p.level > level) {
            level = p.level;
            System.out.println();  // Use println to move to the next line
        }
        System.out.print(p.node.data + " ");  // Use print to stay on the same line
        for (Node child : p.node.children) {
            pair cp = new pair(child, p.level + 1);
            mq.add(cp);
        }
    }
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

        
        // System.out.print("The level order linewise traversal of the tree is:");
        // levelorderLinewisezz(root);
        // System.out.print("The level order linewise traversal of the tree is:");
        // anotermenthodofZZ(root);
        // System.out.print("The level order linewise traversal of the tree is:");
        // levelorderlinewisezz3(root);
        System.out.print("The level order linewise traversal of the tree is:");
        levelorderLineWiseZZ4(root);
    }
}
