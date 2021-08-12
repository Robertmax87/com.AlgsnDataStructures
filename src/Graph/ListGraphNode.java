package Graph;
import java.util.ArrayList;

public class ListGraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;

    public ArrayList<ListGraphNode> neighbors = new ArrayList<ListGraphNode>();

    public ListGraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
