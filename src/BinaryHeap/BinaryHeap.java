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

    /**This is a level order traversal
     * -------parent--------
     *      /       \
     *----left     right----
     * parent then left then right then next parent, so we just iterate over the entire array **/
    public void levelOrder(){
    for (int i = 0; i < heap.length; i++){
        System.out.print(heap[i] + ", ");
    }
}
public void bottomToTop(int index, String heapType){
        //parent is the index of the node we are looking at divided by 2;
    int parent = index/2;
    //of the index is less than or equal to one we have reached the beginning of the array
    if (index<= 1){
        return;
    }
    /** if the heap is min, move the integer up before the parent if it is smaller
     * than the parent...
     */
    if (heapType.equals("Min")) {
        if(heap[index] < heap[parent]){
            swap(heap, index, parent);
        }
    }
    /** if it is a max element move the element past the parent as well
     *
     */
    else if (heapType.equals("Max")) {
        if(heap[index] > heap[parent]){
            swap(heap, index, parent);
        }
    }
bottomToTop(parent, heapType);


}
public void swap(int [] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}
public void insertHeap(int value, String heapType){
    /**With arrays we use the size as an index to place values
     */
    heap[size + 1] = value;
    size++;
    //inserting at the end of the heap, then traversing up comparing
    bottomToTop(size,heapType);
    System.out.println("The value has been successfully inserted");
}
public void topToBottom(int index, String heapType){
    int left = index * 2;
    int right = (index * 2) + 1;
    int swapChild;
    /** if we have no more children because we do not even have a left child in this case
     * then we will return, recursive;
     */
    if (size < left){
        return;
    }
    if (heapType.equals("Max")){
        //if we only have the left Node and the tree isn't big enough to have any other children
        if (size == left){
            if(heap[index] < heap[left] ){
                swap(heap,index,left);
            }
            //Otherwise swap if the Node has a right child as well as a left swap them if the left is bigger than the right

        } else {
            if(heap[left] > heap[right]){
                swap(heap,index, left);
                topToBottom(left,heapType);
            } else{
                swap(heap,index,right);
                topToBottom(right, heapType);
            }

        }
    }
}
public int extractHead(String type){
        if (isEmpty()){
            return -1;
        }
        else{
            //initialize a variable as the root
            int extracted = heap[1];
            //make the root equal to the last value
            heap[1] = heap[size];
            //decrerase the size;
            size--;
            /**go through this method making sure to return the root to its rightful place determined by the heaptype
             * that you passed into the method
             */

            topToBottom(1,type);
            return extracted;
        }


}
}
