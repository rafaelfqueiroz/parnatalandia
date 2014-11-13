import java.util.List;
import java.util.ArrayList;

public class Graph {

	private List<Edge> edges;
	private List<Node> nodes;
	private Node startNode;

	public Graph() {
		this.edges = new ArrayList<Edge>();
		this.nodes = new ArrayList<nodes>();
	}

	public List<Edges> getEdges() {
		return this.edges;
	}

	public List<Nodes> getNodes() {
		return this.nodes;
	}

	public Node getStartNode() {
		return this.startNode;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public void setStartNode(Node startNode) {
		this.startNode = startNode;
	}

	public void addNode(Node node) {
		this.nodes.add(node);
	}

	public void addEdge(Edge edge) {
		this.edges.add(edges);
	}

}