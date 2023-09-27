package PrimerTrimestre.Tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class pruebaS {

	public static void main(String[] args) throws IOException {
		String lectura,numero;
		String salida = "";
		double num;
		BufferedReader  entero = new BufferedReader(FileReader("Textos\\muerte.txt"));
		String texto = "";
		String linea = entero.readLine();
		while(linea!=null) {
			texto = texto + linea;
			linea = entero.readLine();
		}
		System.out.println(texto);
		entero.close();
	}

	private static Reader FileReader(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
