package com;

public class ReSort {
    public static void main(String[] args) {


        int[] nums = {1, 234, 3, 25, 24524, 6, 35, 6, 57, 43, 652, 4512, 46, 253, 623, 57, 2356, 26, 5};
        for (int i = nums.length - 1;i > 0; i--){
            int largest = 0;
            for(int j = 1; j <= i; j++){
                if(nums[largest] < nums[j]){
                    largest = j;
                }
                swap(nums, largest, i);

            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
    public static void swap(int[] nums, int x, int y){
        if (x == y){
            return;
        }
        int holder = nums[x];
        nums[x] = nums[y];
        nums[y] = holder;
    }
}