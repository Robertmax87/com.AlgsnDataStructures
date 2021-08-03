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
}
