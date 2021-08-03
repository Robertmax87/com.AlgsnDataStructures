package SearchAlgs;

public class BinarySearch {
    public static void main(String[] args){

    }
    public static int binarySearch(int[] nums, int target){
    int start = 0;
    // the last index in any array...
    int end = nums.length - 1;
    int mid = (start + end)/ 2;
    while(nums[mid] != target){
        if(nums[mid] < target){
            //keep moving mid down from top
            end = mid -1;


        } else{
            //keep moving mid up from bottom;
            start = mid + 1;
        }
        //update mid
         mid = (start + end)/ 2;
    }
    return mid;
    }
}
