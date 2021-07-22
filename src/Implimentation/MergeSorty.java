package Implimentation;

public class MergeSorty {
    public static void main(String[] args){

    }
    public static void merge(int [] nums, int start, int end){
        if (end - start < 2){
            return;

        } int mid = (end - start)/2;
        merge(nums, start, mid - 1);
        merge(nums,mid,end);
        sort(nums,start,mid,end);
    }
    public static void sort(int[] nums, int start, int mid, int end){
        if (nums[mid - 1] < nums[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            tempArray[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        System.arraycopy(tempArray,i,nums,start + tempIndex, mid - i);
        System.arraycopy(nums,0,nums, start, tempIndex);
    }
}
