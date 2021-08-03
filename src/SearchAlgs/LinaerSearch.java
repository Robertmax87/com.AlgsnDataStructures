package SearchAlgs;

public class LinaerSearch {
    public static void main(String[] args){
        int[] sprinter = {1,2,3,24,13,3,31,524,5,246,24,62,46,2452,54};
        System.out.println(linaerSearch(sprinter, 5));
        System.out.println(linaerBool(sprinter, 5));

    }
    public static int linaerSearch(int[] nums, int x){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static boolean linaerBool(int[] nums, int x){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == x){
                return true;
            }
        }
        return false;
    }
}
