package LinkedListQuestions;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }
    //when called in  main method, rootnode is passed into preorder search method
    public void preOrder(BinaryNode node){
       //base case, bounces up from this
        if (node == null){
            return;
        }
        System.out.print(node.value + "");
        //recursively calls left
        preOrder(node.left);
        //recursively calls right
        preOrder(node.right);
        }
        public void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        //recursively handles left subtree
        inOrder(node.left);
        //visit root node after left subtree
        System.out.print(node.value + "");
        //visit right subtree
        inOrder(node.right);


        }
        public void postTraversal(BinaryNode node){
        if (node == null){
            return;
        }
        //visit left
        postTraversal(node.left);
        //visit right
        postTraversal(node.right);
        //visit root
        System.out.print(node.value);
        }
    }


