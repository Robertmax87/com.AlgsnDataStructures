package LinkedListQuestions;
import java.util.Set;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args){
        LinkedList simmel = new LinkedList();
        LinkedList brober = new LinkedList();
        simmel.insertNode(5);
        simmel.insertNode(3);
        simmel.insertNode(4);
        brober.insertNode(5);
        brober.insertNode(2);
        brober.insertNode(8);
        mergeLists(simmel,brober);


    }

    public static boolean mergeLists(LinkedList l1, LinkedList l2){
       //create hashset to add values from one list to.
        Set<Integer> explorer = new HashSet();
        //start at the beginning of both lists. Instantiate nodes at listheads
          Node curr1 = l1.head;
          Node curr2 = l2.head;
          //ad the nodes from one list to the HashSet.
            while(curr1 != null) {
                explorer.add(curr1.value);
                curr1 = curr1.next;
            }
            //check to see if the Hashset for list one contains any values from list two
            while (curr2 != null) {
                if (explorer.contains(curr2.value)) {
                    System.out.print("true");
                    return true;

                }
                //iterate through the lists
                curr2 = curr2.next;
            }
            System.out.print("false");
           return false;

            }

    }


