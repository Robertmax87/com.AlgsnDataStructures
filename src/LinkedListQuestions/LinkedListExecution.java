package LinkedListQuestions;
import java.util.Collections;
import java.util.HashSet;

public class LinkedListExecution {
    public static void main(String[] args) {

    }

    public static void deleteDups(LinkedList list) {
        //create hashset
        HashSet<Integer> explorer = new HashSet();
        //start at the beginning which would be the head of the list
        //Always use something to start at the beginning of a list.
        Node current = list.head;
        Node prev = null;
        while (current != null) {
            //this value is the value of the current list item that we are looking at.
            int curval = current.value;
           /*if the hashset contains the duplicate value then we will have to set the pointer before (prev) to
           the pointer after the current value that is a duplicate.
            */
            if (explorer.contains(curval)) {
                prev.next = current.next;
                list.size--;


            } else {
                //add all of the values that have no duplicates to the HashSet
                explorer.add(curval);
                //updating previous to current because current used to be head, so previous used to be behind null.
                prev = current;
            }
            //going to the next node to check.
            current = current.next;

        }
    }

    public static void remDupes(LinkedList repo) {
        HashSet<Integer> terminator = new HashSet();
        //instantiating first and previous listNodes
        Node prev = null;
        Node curr = repo.head;
        while (curr != null) {
            int currVal = curr.value;
            if (terminator.contains(currVal)) {
                //skips over
                prev.next = curr.next;
                repo.size--;

            } else {
                //previous shifts to current and current shifts to the next item providing it is not null.
                prev = curr;

            }

            curr = curr.next;
        }
    }

    public static void removeDupes(LinkedList repo) {
        HashSet<Integer> terminate = new HashSet();
        Node prev = null;
        Node curr = repo.head;
        while (curr != null) {
            int currValue = curr.value;
            if (terminate.contains(currValue)) {
                prev.next = curr.next;
            } else {


                prev = curr;
            }
            curr = curr.next;

        }
    }
}
