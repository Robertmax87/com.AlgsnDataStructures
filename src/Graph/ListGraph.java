package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListGraph {
    ArrayList<ListGraphNode> nodeList = new ArrayList<>();

    public ListGraph(ArrayList<ListGraphNode> nodeList){
        this.nodeList = nodeList;
    }
    public void addUndirected(int i, int j){
        ListGraphNode first = nodeList.get(i);
        ListGraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }
    public void bfsVisit(ListGraphNode node){
            LinkedList<ListGraphNode> queue = new LinkedList<ListGraphNode>();
            queue.add(node);
            while(!queue.isEmpty()){
                ListGraphNode curr = queue.remove(0);
                curr.isVisited = true;
                //Maybe print node, maybe not
                for(ListGraphNode neighbor: curr.neighbors){
                    if(!neighbor.isVisited){
                        queue.add(neighbor);
                        neighbor.isVisited = true;
                    }
                }
            }
    }
    public void bfs(){
        for(ListGraphNode node: nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
    public void dfsVisit(ListGraphNode node){
        Stack<ListGraphNode> stack = new Stack<>();
        stack.push(node);

            while(!stack.isEmpty()){
                ListGraphNode curr = stack.pop();
                curr.isVisited = true;

                for(ListGraphNode neighbor: curr.neighbors){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }

    }
    public void dfs(){
        for(ListGraphNode node: nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
    }
}
    }
