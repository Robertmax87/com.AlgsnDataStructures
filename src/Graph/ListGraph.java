package Graph;

import java.util.ArrayList;
import java.util.List;

public class ListGraph {
    ArrayList<ListGraphNode> nodeList = new ArrayList<ListGraphNode>();

    public ListGraph(ArrayList<ListGraphNode> nodeList){
        this.nodeList = nodeList;
    }
    public void addUndirected(int i, int j){
        ListGraphNode first = nodeList.get(i);
        ListGraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }
}
