package SearchAlgs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] garden = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 54, 65};
        System.out.print(biSearcher(garden, 23));
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        // the last index in any array...
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (nums[mid] != target ) {
            if (target < nums[mid]) {
                //keep moving mid down from top
                end = mid - 1;


            } else {
                //keep moving mid up from bottom;
                start = mid + 1;
            }
            //update mid
            mid = (start + end) / 2;

        }
        if (nums[mid] == target) {
            return mid;
        } else {
            return 9;
        }
    }
    public static int biSearcher(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while(nums[mid] != target && start < end){
            if(target < nums[mid]){
                // to inquire about the first half of the array
                end = mid - 1;
            }
            else {
                //to inquire about the second half of the array
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        if (nums[mid] == target){
            return mid;
        }
        else{
            return -1;
        }
    }
    public static int biSearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end)/2;
        while(nums[mid] != target && start < end){
            if (nums[mid] < target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
            mid = (start + end)/2;
        }
        if (nums[mid] == target){
            return mid;
        }
        else{
            return -1;
        }
    }
    public static void merge(int[] nums, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        merge(nums,start,mid);
        merge(nums, mid, end);
        sort(nums, start, mid, end);


    }
    public static void sort(int[] nums, int start, int mid, int end){
        if (nums[mid - 1] <= nums[mid]){
            return;
        }
        int i = start;
        int j = end;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            tempArray[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        System.arraycopy(tempArray, i, nums, tempIndex + start, mid - i);
        System.arraycopy(nums, 0, nums, start, tempIndex);
    }
}
