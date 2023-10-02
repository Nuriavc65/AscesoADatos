package EjerciciosTareas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class dieciseis {

	public static void main(String[] args) throws IOException {
		File fichero = new File("Textos\\16.txt");
		fichero.createNewFile();
		System.out.println("fichero creado");
		FileInputStream reed = new FileInputStream(fichero);
		ObjectInputStream fis = new ObjectInputStream(reed);
			while(fis.available()>0) {
				double numeros = fis.readDouble();
				System.out.println(numeros);
			}
		fis.close();
		reed.close();
	}

}
