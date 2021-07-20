package myOwnTrees;

import com.sun.source.tree.Tree;

public class BinaryTree {
    public TreeNode root;
    BinaryTree(){
        this.root = null;
    }
    public void preOrder(TreeNode ll){
        if (ll == null){
            return;
        }
        System.out.println(ll.value);
        /** Recursively goes to the left, then recursively goes to the right
         *
         */
        preOrder(ll.left);
        preOrder(ll.right);

    }
    public void inOrder(TreeNode leaf){
        if (leaf == null){
            return;
        }
        inOrder(leaf.left);
        System.out.print(leaf.value);
        inOrder(leaf.right);
    }
    public void postOrder(TreeNode leaf){
        if (leaf == null){
            return;
        }
        postOrder(leaf.left);
        postOrder(leaf.right);
        System.out.print(leaf.value);
    }

}
