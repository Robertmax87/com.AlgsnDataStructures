package LinkedListQuestions;

public class SumLists extends LinkedListExecution{
    public static void main(String[] args) {

    }
    // My attempt to iterate over the list, add and have remainders moving backwards to use for the new list;
    public static void sumLists(LinkedList l1, LinkedList l2) {
        Node curr1 = l1.head;
        Node curr2 = l2.head;
        LinkedList l3 = new LinkedList();
        Node spotter = l3.head;
        for (int i = 0; 1 < l2.size; i++) {
            while (curr1 != null) {
                curr1 = curr1.next;
                curr2 = curr2.next;

            }
            if (curr2.value + curr1.value < 10) {
                int hexer = curr2.value + curr1.value;
                l3.tail.value = hexer;

            } else {
                int mod = (curr2.value + curr1.value) % 10;
                int rememberMe = 1;
                l3.tail.value = mod;
            }


        }
    }
    //The teacher's answer
    //Do recursively


}
