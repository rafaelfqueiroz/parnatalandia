package utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * THAT'S WHY SOFTWARE ENGINEERING IS BEAUTIFUL
 * PT-BR: Classe respons‡vel por clonar objetos usando Generics.
 * EN-US: Class that clones an object using Generics. 
 * 
 * @author rafaelfdequeiroz
 */

public class CloneMachine {
	
	public static CloneMachine cloneMachine;
	
	private CloneMachine() {}
	
	public static CloneMachine getInstance() {
		if (cloneMachine == null) {
			cloneMachine = new CloneMachine();
		}
		return cloneMachine;
	}
	
	public <T> T clone(Object obj, Class<T> classType) {
		Object clone = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(obj);
			out.flush();
			out.close();

			ObjectInputStream in = new ObjectInputStream(
					new ByteArrayInputStream(bos.toByteArray()));
	        	clone = in.readObject();

		} catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
		return classType.cast(clone);
	}
	
}
