package LinkedListQuestions;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //when called in  main method, rootnode is passed into preorder search method
    public void preOrder(BinaryNode node) {
        //base case, bounces up from this
        if (node == null) {
            return;
        }
        System.out.print(node.value + "");
        //recursively calls left
        preOrder(node.left);
        //recursively calls right
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        //recursively handles left subtree
        inOrder(node.left);
        //visit root node after left subtree
        System.out.print(node.value + "");
        //visit right subtree
        inOrder(node.right);


    }

    public void postTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        //visit left
        postTraversal(node.left);
        //visit right
        postTraversal(node.right);
        //visit root
        System.out.print(node.value);
    }

    //will not take any parameters
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        //root is at first level so visit root first
        //add the first element to the binary tree
        queue.add(root);
        //visit all the nodes; uses O(N) time complexity
        // while the Queue is not empty
        while (!queue.isEmpty()) {
            /**While queue is not empty add and remove elements from the queue.
             removes the first value, then adds two values, removes right first
             then adds two values removes left, then adds two values removes right;
             then keeps removing values and printing values once all of the values are added...
             *
             */

            BinaryNode present = queue.remove();
            System.out.print(present.value);
            if (present.left != null) {
                queue.add(present.left);
            }
            if (present.right != null) {
                queue.add(present.right);
            }
        }
    }

    /**
     * For a Binary Search use level order traversal on order to search all nodes and levels
     * to find the nodes you're looking for.
     */
    public void search(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            /**This part is needed in order to traverse the tree and check to see if the node we
             * are looking for is the one we are looking at. PresentValue is a node we are removing
             * then looking at/checking to see if it is our value.
             */
            if (presentNode.value.equals(node.value)) {
                System.out.print("The Node is found");
                return;
            } else {
                if (presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
            System.ar
        }
        System.out.print("The node isn't found");
    }
}


