package domain;

import utils.CloneMachine;

public class Simulator {
	public void simulate(Set set, Graph graph, int currentEdgeIndex, Result result) {
		Set s = new Set();
		s = CloneMachine.getInstance().clone(set, Set.class);

		if (currentEdgeIndex < graph.getEdges().size()) {
			simulate(s, graph, currentEdgeIndex+1, result);
			Node first = UF.find(graph.getEdges().get(currentEdgeIndex).getFirstNode());
			Node second = UF.find(graph.getEdges().get(currentEdgeIndex).getSecondNode()); 
			if (first != second) {
				s.addEdgeOnList(graph.getEdges().get(currentEdgeIndex));
				simulate(s, graph, currentEdgeIndex + 1, result);
			}
		} else {
			if (s.validate(Node.getQuantityOfLinks())) {
				result.getListOfSets().add(set);
				if (set.getTotalWeight() < result.getBetterSet().getTotalWeight()) {
					Set temp = CloneMachine.getInstance().clone(set, Set.class);
					result.getBetterSet().setEdges(temp.getEdges());
					result.getBetterSet().setNodes(temp.getNodes());
				}
			}
		}
	}
}