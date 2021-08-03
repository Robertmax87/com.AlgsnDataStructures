package Graph;
import java.util.ArrayList;


public class Graph {
    public ArrayList<GraphNode> nodeList;
    int[][] adjacencyMatrix;
    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList= nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }
    public void addUndirectedEdge(int i, int j){
        //initialize edges between each of these nodes to each other because these edges are undirected... j -> i && i -> j
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }
}
