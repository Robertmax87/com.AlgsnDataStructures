package com;

public class LeetcodeMergeSort {
    public static void main(String[] args){
        int[] nums = {5,2,3,1};
        sortArray(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums);
        }
    }
    public static int[] sortArray(int[] nums) {
        /**the merge sort needs the first integer and the amount of
         integers so the first int is nums[0] and the length is nums.length**/
        mergeit(nums, 0, nums.length - 1);
        System.out.print(nums);
        return nums;
    }
    public static void mergeit(int[] nums, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        mergeit(nums, start, mid);
        mergeit(nums, mid, end);
        sort(nums, start, mid, end);
    }
    public static void sort(int[] nums, int start, int mid, int end){
        if(nums[mid - 1]<= nums[mid]){
            return;
        }
        int i = start;
        int j = end;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            tempArray[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        System.arraycopy(nums, i, nums, tempIndex + start, mid - i);
        System.arraycopy(tempArray, 0, nums, start, tempIndex);

    }
}
