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
        brober.insertNode(1);
        brober.insertNode(2);
        brober.insertNode(8);
        mergeLists(simmel,brober);


    }

    public static boolean mergeLists(LinkedList l1, LinkedList l2){
        Set<Integer> explorer = new HashSet();

          Node curr1 = l1.head;
          Node curr2 = l2.head;
            while(curr1 != null){
                explorer.add(curr1.value);
                curr1 = curr1.next;
                 int beiber = curr2.value;
                 curr2 = curr2.next;
                 if (explorer.contains(beiber)){
                     System.out.print("true");
                     return true;
                 }
            }
            System.out.print("false");
           return false;

            }

    }


