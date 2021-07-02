package LinkedListQuestions;
import java.util.Collections;
import java.util.Collections;
import java.util.HashSet;


public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLinkedList(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail = newNode;
        head = newNode;
        size = 1;

    }
    public void insertNode(int nodeValue){
        if (head == null){
            createLinkedList(nodeValue);
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next= newNode;
        tail = newNode;
        size++;
    }
    public void traversal(){
        Node tempNode = head;
        for (int i = 0; i < size; i++){
            System.out.print(tempNode.value);
            if (i != size - 1){
                System.out.print("-->");
            }
            tempNode = tempNode.next;
        }
    }
    // Question for linkedList exercise {removeDups}


    }

