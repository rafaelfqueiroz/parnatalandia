package utils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import domain.Graph;
import domain.Node;
import domain.Result;

public class FileOutPut {
	private static final String PATH_OF_FILE = "/home/hamurabi/Documentos/Java_Projects/parnatalandia/teste.txt";
	
	public void exportData(final long time, Result results){
		BufferedWriter bWriter = null;
		String lineNodes = "";
		int sum = 0, totalResults = results.getListOfSets().size();
		
		try {
			bWriter = new BufferedWriter(new FileWriter(PATH_OF_FILE));
			
			for (int i = 0; i < results.getBetterSet().getEdges().size(); i++){
				sum += results.getBetterSet().getEdges().get(i).getWeight();
				
				lineNodes += results.getBetterSet().getEdges().get(i).getFirstNode().getIndex() + " " + results.getBetterSet().getEdges().get(i).getSecondNode().getIndex() + ", ";
			}
			
			bWriter.write(sum + "\n" + lineNodes + "\n" + totalResults + "\n" + time );
			
		} catch (IOException ex){
			System.out.println("Erro na leitura do arquivo: ");
			ex.printStackTrace();
		} finally {
			try {
				if (bWriter != null) {
					bWriter.close();
				}
			} catch (IOException ex) {
				System.out.println("Erro ao tentar fechar o leitor de arquivo: ");
				ex.printStackTrace();
			}
		}
	}
}