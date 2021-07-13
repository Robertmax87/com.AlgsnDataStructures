package StackImplimentation;
import java.util.Stack;

public class MainStacks {
    public static void main(String [] args){
        Stack newbie = new Stack();
        System.out.println(newbie.isEmpty());



    }
    public boolean isValid(String s){
        Stack<Character> snake = new Stack();
        int counter = 0;
        while(counter < s.length()){
            snake.push(s.charAt(counter));
            counter++;

        }
        return false;

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0){
            return;
        } else if (m == 1)
            System.arraycopy(nums2,0,nums1,0,1);

    }


}
