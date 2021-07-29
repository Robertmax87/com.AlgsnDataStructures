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
    public int getBalance(TreeNode node){
        if (node == null){
            return 0;
        }
        /**Recursively goes down the line until gets to the bottom right node and the bottom left node.
         * Calls getHeight on both of these and then returns the balance which should not be more or less than
         * {-1,0,1}
         */
        return getHeight(node.left) - getHeight(node.right);
    }
    public TreeNode insertNode(TreeNode node, int value){
        if (node == null){
            TreeNode newNode = new TreeNode();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        } else if(node.value < value){
            node.left = insert(node.left,value);

        } else {
            node.right = insert(node.right, value);
        }
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);
        if (balance > 1 && value < node.left.value){
            rotateRight(node);
        }
        if (balance > 1 && value > node.right.value){
            node.left = rotateLeft(node);
            return rotateRight(node);
        }
        if(balance < -1 && value > node.right.value){
            return rotateLeft(node);
        }
        if(balance < -1 && value < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
}
