package utils;

import domain.Edge;
import domain.Graph;
import domain.Node;

public class GraphBuilder {

	private Graph graph;

	public GraphBuilder() {
		this.graph = new Graph();
	}

	public GraphBuilder(Graph graph) {
		this.graph = graph;
	}

	public void createAndAddFirstNode() {
		Node firstNode = new Node();
		firstNode.setIndex(-1);
		this.graph.addNode(firstNode);
		this.graph.setStartNode(firstNode);
	}

	public void createAndAddNode(int edgeWeight, int index) {
		Node currentLineNode = this.graph.getNodes().get(index);
		Node newNode = new Node();
		this.graph.addNode(newNode);
		Edge linkEdge = new Edge(edgeWeight);
		linkEdge.setFirstNode(currentLineNode);
		linkEdge.setSecondNode(newNode);
		this.graph.addEdge(linkEdge);
	}

	public Graph getCurrentGraph() {
		return this.graph;
	}
}