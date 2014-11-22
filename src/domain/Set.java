package domain;

import java.util.List;

public class Set {
	private List<Node> nodes;
	private List<Edge> edges;
	private Node representative;

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
}