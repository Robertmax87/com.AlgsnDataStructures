package StackImplimentation;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private final int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];

    }
    public boolean isFull(int stackNum){
        if(sizes[stackNum] == stackCapacity){
            return true;
        }
        return false;

    }
    public boolean isEmpty(int stackNum){
        if (sizes[stackNum] == 0){
            return true;
        }
        return false;

    }
    private int indexOfTop(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size -1;
    }


}
