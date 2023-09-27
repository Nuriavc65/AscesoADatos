package EjerciciosTareas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class catorce {

	public static void main(String[] args) throws IOException {
		File binario = new File("Textos\\13and14.txt");
		FileInputStream reed = new FileInputStream(binario);
		ObjectInputStream fis = new ObjectInputStream(reed);
		while(fis.available()>0) {
			double numeros = fis.readDouble();
			System.out.println(numeros);
		}
		
	}

}
