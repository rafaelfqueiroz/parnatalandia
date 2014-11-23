package domain;

import java.io.Serializable;
import java.util.List;

public class Set implements Serializable {
	private List<Node> nodes;
	private List<Edge> edges;
	private Node representative;

	public Set() {
		
	}
	
	public Set(Node representative) {
		this.representative = representative;
		nodes.add(representative);
	}

	public void addNodeOnList(Node n) {
		this.nodes.add(n);
	}

	public Node getRepresentative() {
		return this.representative;
	}

	public void setRepresentative(Node n) {
		this.representative = n;
	}

	public int getQttOfNodes(){
		return this.nodes.size();
	}

	public Node getNodeAt(int index){
		return nodes.get(index);
	}

	public void addEdgeOnList(Edge e){
		edges.add(e);
	}

	public int getTotalWeight() {
		int total = 0;
		for (int i = 0;i < edges.size();i++) {
			total += edges.get(i).getWeight();
		}
		return total;
	}
	
	public List<Edge> getEdges(){
		return this.edges;
	}
	
	public List<Node> getNodes(){
		return this.nodes;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public boolean validate(int quantityOfLinks) {
//		if (this.edges.size() == this.nodes.size()-1){
//			for (int i = 0; i < this.getQttOfNodes(); i++){
//				if ()
//			}
//		}
		
		return true;	
	}
}