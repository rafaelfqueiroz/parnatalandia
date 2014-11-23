package domain;

import java.util.List;

class Simulate {
	private Graph graph;
	private List<Edge> edges;
	private List<Node> nodes;


	public Simulate(Graph g) {
		this.graph = g;
		this.edges = g.getEdges();
		this.nodes = g.getNodes();
	}

	public void setGraph(Graph g) {
		this.graph = g;
	}
	
	public void startSimulation() {
		
	}

	public void run(){
		
	}
}