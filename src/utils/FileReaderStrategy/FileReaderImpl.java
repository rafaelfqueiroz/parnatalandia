package utils.FileReaderStrategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import domain.Node;
import domain.Graph;
import utils.GraphBuilder;

public class FileReaderImpl implements DataReader {

	private static final String PATH_OF_FILE = "";
	private static final int FIRST_LINE = 1;

	public Graph readData() {
		//TODO
		//Instanciar um InputStream passando o path e realizar a leitura.
		//Para cada linha lida, enviar para a classe GraphBuilder que irá criar os nodos e arestas.
		BufferedReader bReader = null;
		Graph graph = null;
		try {
			String currentLine = "";
			bReader = new BufferedReader(new FileReader(PATH_OF_FILE));
			graph = new Graph();
			int lineNumber = 1;
			String[] lineValues = null;
			GraphBuilder graphBuilder = new GraphBuilder();
			while((currentLine = bReader.readLine()) != null) {
				lineValues = currentLine.split(" ");
				if (lineNumber == FIRST_LINE) {
					Node.setQuantityOfLinks(Integer.parseInt(lineValues[1]));
					graphBuilder.createAndAddFirstNode();
				} else {
					for (int i = 0; i < lineValues.length;i++) {
						graphBuilder.createAndAddNode(Integer.parseInt(lineValues[i]), lineNumber - 2);
					}
				}
				lineNumber++;
			}
			graph = graphBuilder.getCurrentGraph();
		} catch (IOException ex){
			System.out.println("Erro na leitura do arquivo: ");
			ex.printStackTrace();
		} finally {
			try {
				if (bReader != null) {
					bReader.close();
				}
			} catch (IOException ex) {
				System.out.println("Erro ao tentar fechar o leitor de arquivo: ");
				ex.printStackTrace();
			}
		}
		return graph;
	}
}