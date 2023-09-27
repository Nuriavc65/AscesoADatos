package EjerciciosTareas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class diez {

	public static void main(String[] args) throws IOException {
		int numeroLineas = 0;
		int numeroPalabras = 0;
		String [] palabras;
		File documento = new File("textos\\documento.txt");
		BufferedReader lector = new BufferedReader(new FileReader(documento));
		String linea = lector.readLine();
		while(linea != null) {
			System.out.println(linea);
			palabras = linea.split(" ");
			linea = lector.readLine();
			numeroLineas++;
			numeroPalabras += palabras.length;
		}
		lector.close();
		System.err.println("FINAL DE LA LISTA");
		System.out.println(" numero de lineas:" + numeroLineas + " numero de palabras:" + numeroPalabras);
	}
}


