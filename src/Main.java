import domain.Graph;
import domain.Result;
import domain.Set;
import domain.Simulator;
import utils.FileOutPut;
import utils.FileReaderStrategy.DataReader;
import utils.FileReaderStrategy.FileReaderImpl;

public class Main {

	public static void main(String[] args) {
		DataReader reader = new FileReaderImpl();
		
		Graph graph = reader.readData();
		Simulator simulator = new Simulator();
		Result result = new Result();
		Set set = new Set();
		FileOutPut stream = new FileOutPut();
		
		final long startTime = System.currentTimeMillis();
		simulator.simulate(set, graph, result);
		final long endTime = System.currentTimeMillis();
		
		stream.exportData(endTime - startTime, result);
	}

}