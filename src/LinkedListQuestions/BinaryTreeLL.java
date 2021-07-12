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
        queue.add(root);
        while (!queue.isEmpty()) {
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
}


