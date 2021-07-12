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

}
