import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader implements DataReader {

	private static final String PATH_OF_FILE = "";

	public Graph readFile() {
		//TODO
		//Instanciar um InputStream passando o path e realizar a leitura.
		//Para cada linha lida, enviar para a classe GraphBuilder que irá criar os nodos e arestas.
		BufferedReader bReader = null;
		try {
			String currentLine = "";
			bReader = new BufferedReader(new FileReader(PATH_OF_FILE));
			while((currentLine = bReader.readLine()) != null) {

			}
		} catch (IOException ex){
			System.out.println("Erro na leitura do arquivo: " + e.getStackTrace());
		} finally {
			try {
				if (bReader != null) {
					bReader.close();
				}
			} catch (IOException ex) {
				System.out.println("Erro ao tentar fechar o leitor de arquivo: " + e.getStackTrace());
			}
		}
	}
}