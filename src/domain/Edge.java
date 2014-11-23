package domain;

import java.io.Serializable;

public class Edge implements Serializable{

	private Node firstNode;
	private Node secondNode;
	private int weight;

	public Edge(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return this.weight;
	}

	public Node getFirstNode() {
		return this.firstNode;
	}

	public Node getSecondNode() {
		return this.secondNode;
	}

	public void setFirstNode(Node firstNode) {
		this.firstNode = firstNode;
	}

	public void setSecondNode(Node secondNode) {
		this.secondNode = secondNode;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}