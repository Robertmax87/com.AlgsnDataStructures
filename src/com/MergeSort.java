package com;

public class MergeSort {
    public static void main(String[] args){
        int[] nums = {1,2,23,1,4,23,5,245,24,52,46,24};
        merge(nums, 1,12);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
    }
    public static void merge(int [] nums, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end)/2;
        merge(nums, start, mid );
        merge(nums, mid, end);
        sort(nums, start, mid, end);
    }
    public static void sort(int[] nums, int start, int mid, int end){
        if(nums[mid - 1] <= nums[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            tempArray[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        System.arraycopy(nums, i,nums, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, nums, start, tempIndex);


    }
}
