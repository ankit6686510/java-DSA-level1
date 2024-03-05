package BinarySearchTree;

public class creatingTree {
    public class Node {

        int val;
        Node left;
        Node right;

    }

    private Node root;

    public creatingTree(int[] in) {
        root = createTree(in, 0, in.length - 1);

    }

    public Node createTree(int[] in, int si, int ei) {
        if(si>ei){
            return null;     
        }
        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left = createTree(in, si, mid -1);
        nn.right = createTree(in, mid+1,ei);
        return null;
    }

    public static void main(String[] args) {
        int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        creatingTree bst = new creatingTree(in);
    }

}
