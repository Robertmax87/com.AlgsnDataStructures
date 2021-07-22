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
    /** Insert a Node into a Binary Search Tree. How will we do this? Well I am expecting that we will use a level order
     * traversal to traverse the list comparing the node we want to insert to the root-nodes. If less than we go to the
     * left, if greater than we go to the right.
     */
    public TreeNode insert(TreeNode currentNode, int value){
        /** If the root is null; then you would need to create another treeNode or tree in general and just
         * put the value in. This way we can always insert a Node no matter what. Otherwise we
         * move to the left and the right of the of the node we are examining looking for the correct insert point.
         */
        if (currentNode == null){
            TreeNode newNode = new TreeNode();
            newNode.value = value;
            System.out.print("value successfully inserted");
            return newNode;
        }else if (value <= currentNode.value){
            /**This is a recursive call "Insert Node" and then if the Node is null we insert.
             * so the currentnode
             */
            currentNode.left = insert(currentNode,value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode,value);
            return currentNode;
        }

    }

    /** main insert method, Inserts the root and the value into the other method
     * the root is the currentNode that is being moved about in the method above.
     * The method above only needs the value, it ends up making a new Node once we point and travel enough
     * for it to be null.
     */

    public void inserter(int value){
        insert(root, value);
    }
    public int getHeight(TreeNode node){
        if (node == null){
            return 0;
        }
        return node.height;
    }
}
