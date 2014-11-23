package domain;

import java.io.Serializable;
import java.util.List;

public class Node implements Serializable{

	private List<Edge> edges;
	private int index;
	private static int quantityOfLinks = 0;
	public Set set;

	public Node() {
		this.set = new Set(this);
	}

	public Node(int index) {
		this.index = index;
		this.set = new Set(this);
	}

	public List<Edge> getEdges() {
		return this.edges;
	}

	public int getIndex() {
		return	this.index;
	}

	public static int getQuantityOfLinks() {
		return quantityOfLinks;
	}

	public static void setQuantityOfLinks(int quantityOfLinks) {
		quantityOfLinks = quantityOfLinks;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}