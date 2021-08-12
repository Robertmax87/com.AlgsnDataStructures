package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


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
    public void addDirectedEdge(int direced, int j){
        adjacencyMatrix[direced][j] = 1;
    }
    //Gets neighbors of any given node
    public ArrayList<GraphNode> getNeighbors(GraphNode node){
        //instantiate a list that will hold our neighbor nodes;
        ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
        //this is the index or the line of nodes we are looking at.
        int nodeIndex = node.index;
        //iterating through a line of the adjacency matrix
        for(int i = 0; i < adjacencyMatrix.length; i++){
           //remember that if we have A 1 value here then we have a neighbor
            if(adjacencyMatrix[nodeIndex][i] == 1){
                //add it to the nodeList that we instantiated above...
                neighbors.add(nodeList.get(i));
                //add the neighbors to the list and then we will use this list later...
            }
        }
        return neighbors;
    }
    //The node where we start our traversal
    public void bfsVisit(GraphNode node){
        // we will start a Linked List that will act as a queue;
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        // add the first or the rootNode just like Level Order Traversal...
        queue.add(node);
        //while the queue is not empty
        while(!queue.isEmpty()){
            //remove the nodes, count them as visited...
            GraphNode curr = queue.remove(0);
            curr.isVisited = true;
            //our list gets the neighbors list that we returned above...
            ArrayList<GraphNode> neighbors = getNeighbors(curr);
            //for the neighbors in the neighbor list
            for(GraphNode neighbor: neighbors) {
                //if the neighbor has not been visited add the neighbor to the "queue"
                if (!neighbor.isVisited){
                    queue.add(neighbor);
                }
            }
        }

    }
    public void bfsEr(GraphNode node){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode curr = queue.remove();

            //queue.add(neighbor);
        }
    }
    public void bFS(){
        //visit the nodes;
        for(GraphNode node: nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
}
