package BinaryHeap;
/**Impliment using Array
 * implimentationleft child = [2x]
 *  right child = [2x + 1]
 */

public class BinaryHeap{
    public int[] heap;
    public int size;


public BinaryHeap(){
    heap = new int[size + 1];
    size = 0;

}
public Boolean isEmpty(){
    if (size == 0){
        return true;
    }
    return false;
}
public int peek(){
    if (isEmpty()){
        System.out.println("The Binary Tree is Empty");

    }
    return heap[1];

}
public int size(){
    return size;
}
public void levelOrder(){
    for (int i = 0; i < heap.length; i++){
        System.out.print(heap[i] + ", ");
    }
}
public void insertHeap(int x, String heapType){
    int parent = x/2;
    if (x<= 1){
        return;
    }
    if (heapType == "min") {
        if(heap[x] < heap[parent]){
            swap(heap, x, parent);
        }
    }


}
public void swap(int [] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}
}
