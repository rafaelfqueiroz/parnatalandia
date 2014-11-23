package domain;

import java.util.List;
import utils.CloneMachine;

public class Simulator {
	public void simulate(Set set, Graph graph, Result result) {
		Set s = new Set();
		CloneMachine.getInstance().clone(set, Set.class);

		if (graph.getCurrentEdgeIndex() < graph.getEdges().size()){
			graph.setCurrentEdgeIndex(graph.getCurrentEdgeIndex() + 1);
			simulate(s, graph, result);

			if (UF.find(graph.getEdges().get(graph.getCurrentEdgeIndex()).getFirstNode()) != 
				UF.find(graph.getEdges().get(graph.getCurrentEdgeIndex()).getSecondNode())) {
				s.addEdgeOnList(graph.getEdges().get(graph.getCurrentEdgeIndex()));
				simulate(s, graph, result);
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