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
        int mid = (start + end) / 2;
        merge(nums,start,mid);
        merge(nums,mid,end);
        sort(nums, start, mid, end);
    }
    public static void sort(int[] arr, int start, int mid, int end){
        if(arr[mid - 1] <= arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArr = new int[end - start];
        while(i < mid && j < end){
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(tempArr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(arr, 0, arr,start,tempIndex );
    }

}
