package EjerciciosTareas;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class diecisiete {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		File fichero = new File("Textos\\17.txt");
		fichero.createNewFile();
		System.out.println("INSERTE FRASE: ");
		String frase = in.readLine();
	}

}
