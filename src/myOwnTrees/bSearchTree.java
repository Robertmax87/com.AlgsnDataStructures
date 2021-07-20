package myOwnTrees;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bSearchTree {

    TreeNode root;
    bSearchTree() {
        this.root = null;
    }
    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode present = queue.remove();
            System.out.println(present);
            if(present.right != null){
                queue.add(present.right);
            }
            if (present.left != null){
                queue.add(present.left);
            }
        }


    }
    public int search(TreeNode rooter){
        Queue<TreeNode> leveler = new LinkedList();
        leveler.add(root);
        int node = 1;
        while(!leveler.isEmpty()){
            TreeNode pNode = leveler.remove();
            if (pNode == rooter){
                System.out.print("We have found the node:" + node);


            }
            if(pNode.left!=null){
                leveler.add(pNode.left);
                node++;
            }
            if (pNode.right!=null){
                leveler.add(pNode.right);
                node++;
            }

        }
        return node;

    }
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
    }
    /** Insert a Node into a Binary Search Tree. How will we do this? Well
}
