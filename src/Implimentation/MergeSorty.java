package Implimentation;

public class MergeSorty {
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
        //Remember that it's start + end not end - start.
        int mid = (end + start)/2;
        merge(nums,start, mid);
        merge(nums, mid, end);
        sort(nums,start, mid, end);

    }
    public static void sort(int[] nums, int start, int mid, int end){
        if(nums[mid-1] <= nums[mid]){
            return;

        }
        int i = start;
        int j = mid;
        int[] tempNums = new int[end - start];
        int tempIndex = 0;
        while(i < mid && j < end){
            tempNums[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        /**From the original array into the original array from position i... These are all of the numbers (i's)
         * that have been left over from the tempArray that we copied into.
         */
        System.arraycopy(nums, i, nums, tempIndex + start, mid - i);
        System.arraycopy(tempNums, 0, nums, start, tempIndex);
    }
}

