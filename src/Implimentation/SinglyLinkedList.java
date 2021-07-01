package Implimentation;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;




    public Node singleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.nextRef = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size= 1;
        return head;
    }
    public void listInsertion(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            singleLinkedList(nodeValue);
            return;
        }



    }
    public void lastInsertion(Node n){
        n.nextRef = null;
        tail.nextRef = n;
        tail = n;
    }
}
