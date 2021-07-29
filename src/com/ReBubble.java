package com;

public class ReBubble {
    public static void main(String[] args) {
        int[] nums = {1, 2, 23, 1, 4, 23, 5, 245, 24, 52, 46, 24};

        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }


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