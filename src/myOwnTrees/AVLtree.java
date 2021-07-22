package myOwnTrees;

import java.util.LinkedList;
import java.util.Queue;

public class AVLtree {
    TreeNode root;
    public AVLtree(){
        root = null;
    }
    public void preOrder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node);
        preOrder(node.left);
        preOrder(node.right);

    }
    public void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node);
        inOrder(node.right);
    }
    public void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node);
    }
    public void levelOrder(){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.remove();
            System.out.print(curr);
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }
    public TreeNode search(TreeNode node, int value){
        if (node == null){
            System.out.print("the Value has not been found");
            return null;
        }
        else if(node.value == value) {
            System.out.print("the Value has not been found");
            return node;
        }
        else if (node.value < value){
            return search(node.left, value);
        }
        else
        {
            return search(node.right,value);
        }

    }
    public void searcher(TreeNode node, int value){
        search(root,value);
    }
    public TreeNode insert(TreeNode curr, int val){
        if(curr == null){
            TreeNode current = new TreeNode();
            current.value = val;
            return current;
        } else if (val <= curr.value ){
            curr.left =insert(curr, val);
            return curr;
        } else {
            curr.right = insert(curr, val);
            return curr;
        }

    }
        public TreeNode insertTheReal(TreeNode node, int value){
        return insert(root, value);
        }
    public int getHeight(TreeNode node){
        if (node == null){
            return 0;
        }
        return node.height;
    }
    /**Rotate methods:
     * Rotate right, takes in the node that is disbalanced...
     */
    public TreeNode rotateRight(TreeNode displaced){
        TreeNode newRoot = displaced.left;
        displaced.left = displaced.left.right;
        newRoot.right = displaced;
        displaced.height = 1 + Math.max(getHeight(displaced.left), getHeight(displaced.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;

    }
    public TreeNode rotateLeft(TreeNode displaced){
        TreeNode newRoot = displaced.right;
        displaced.right = displaced.right.left;
        newRoot.left = displaced;
        displaced.height = 1 + Math.max(getHeight(displaced.left), getHeight(displaced.right));
        newRoot.height = 1 + Math.max(getHeight(displaced.left), getHeight(displaced.right));
        return newRoot;
    }
}
