package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class LeetCodeGraph {
    public static void main(String[] args){

    }
    public static int matrixSolve(int n, int[][] edges){
        //instantiate a HashMap that takes an integer (i) and a new "list" which is the matrix
        HashMap<Integer, List<Integer>> explorer = new HashMap<>();
        for(int i = 0; i < n; i++){
            explorer.put(i, new LinkedList<Integer>());
        }
        for(int i = 0; i < edges.length; i++){
            //here we are populating the adjacency matrix
            explorer.get(edges[i][0]).add(edges[i][1]);
            explorer.get(edges[i][1]).add(edges[i][0]);
        }

return 1;
    }
}

