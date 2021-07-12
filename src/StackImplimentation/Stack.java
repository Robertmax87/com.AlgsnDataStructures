package StackImplimentation;

public class Stack {
    public int[] arr;
    public int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("the stack is created with size of size:" + size);
    }
    public boolean isEmpty() {
        if ( topOfStack == -1){
            return true;
        }
        return false;
}
    public boolean isFull(){
        if (topOfStack == arr.length - 1){
            return true;
        }
        return false;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.print("Full-Stack Academy");
        }
        arr[topOfStack + 1] = value;
        topOfStack++;
        int placeVal = topOfStack - 1;
        System.out.print("value__" + value + "__inserted at:" + placeVal);
    }
    public int top(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        }
        int topStack = arr[topOfStack];
        topOfStack--;
        return topOfStack;

    }
    }

