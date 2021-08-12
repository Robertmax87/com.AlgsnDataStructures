package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args){
        int[][]edges = {{1,2},{2,3},{4,2}};
        System.out.println(findCenter(edges));

    }
    public static int findCenter(int[][] edges) {
        HashSet<Integer> container = new HashSet<>();
        ArrayList<Integer> explorer = new ArrayList<>();
        for(int i = 0; i< edges.length; i++){
            if(container.contains(edges[i][0])){

                explorer.add(edges[i][0]);
            }
                container.add(edges[i][0]);


        }


        return explorer.remove(0);
    }
}
