package BinaryTree;

public class balancedbinarytree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode() {
        }
    
        TreeNode(int val) {
            this.val = val;
        }
    
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    static class Solution {
        public boolean isBalanced(TreeNode root) {
            return balanced(root);
        }
        
        public boolean balanced(TreeNode root) {
            if(root == null){
                return true;
            }
            
            boolean left = balanced(root.left);
            boolean right = balanced(root.right);
            boolean sb = Math.abs(height(root.left) - height(root.right)) <= 1;
            
            return left && right && sb;
        }
        
        public int height(TreeNode root) {
            if(root == null) {
                return 0;
            }
            
            int lh = height(root.left);
            int rh = height(root.right);
            
            return Math.max(lh, rh) + 1;
        }
    }
    
    public static void main(String[] args) {
        // Create a binary tree for testing
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Create an instance of Solution class
        Solution solution = new Solution();

        // Check if the tree is balanced
        boolean isBalanced = solution.isBalanced(root);

        // Output the result
        System.out.println("Is the tree balanced? " + isBalanced);
    }
}
//more baklanced approach  O(n)
/*
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return balanced(root).isBal;
    }

    public BalancePair balanced(TreeNode root) {
        if (root == null) {
            return new BalancePair();
        }
        BalancePair lbp = balanced(root.left);
        BalancePair rbp = balanced(root.right);
        BalancePair sbp = new BalancePair();
        sbp.height = Math.max(lbp.height, rbp.height) + 1;
        boolean sb = Math.abs(lbp.height - rbp.height) <= 1;
        sbp.isBal = lbp.isBal && rbp.isBal && sb;
        return sbp;
    }

    class BalancePair {
        boolean isBal = true;
        int height = -1;
    }
}

 */