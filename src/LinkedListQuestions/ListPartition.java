package LinkedListQuestions;

public class ListPartition {
    //Partition the list around a node; [nodes < than NODE < than node]
    public static void main(String[] args) {

    }

    public static LinkedList partition(LinkedList list, int x) {
        //Head and tail are the first elements in the list.
        Node currentNode = list.head;
        Node tail = list.head;

        while (currentNode != null) {
            //Partitions the greater elements before the item.
            //Because we started at the beginning we now look at the items after.
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = list.head;
                list.head = currentNode;
            }
            else {
                list.tail.next = currentNode;
                list.tail = currentNode;
        }

            currentNode = next;

        }
        list.tail.next =null;
        return list;
    }

}







