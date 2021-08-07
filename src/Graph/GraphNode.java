package Graph;

public class GraphNode {
    public String name;
    public int index;
    public boolean visited;
    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
        this.visited = false;

    }
}
