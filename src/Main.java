import domain.Edge;
import domain.Graph;
import domain.Node;
import domain.Result;
import domain.Set;
import domain.Simulator;
import utils.FileOutPut;
import utils.FileReaderStrategy.DataReader;
import utils.FileReaderStrategy.FileReaderImpl;

public class Main {

	private static final int START_EDGE = 0;
	public static void main(String[] args) {
		DataReader reader = new FileReaderImpl();
		
		Graph graph = reader.readData();
		Simulator simulator = new Simulator();
		Result result = new Result();
		result.getBetterSet().getEdges().add(new Edge(Integer.MAX_VALUE));
		FileOutPut stream = new FileOutPut();
		final long startTime = System.currentTimeMillis();
		simulator.simulate(graph.getStartNode().getSet(), graph, START_EDGE, result);
		System.out.println(result.getBetterSet().getTotalWeight());
		final long endTime = System.currentTimeMillis();
		
		stream.exportData(endTime - startTime, result);
	}

}