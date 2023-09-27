package EjerciciosTareas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class once {

	public static void main(String[] args) throws IOException {
	File archivo = new File("textos//ejer11.txt");
	archivo.createNewFile();
	BufferedWriter out = new BufferedWriter(new FileWriter(archivo,true));
		out.newLine();
		out.write("holap");
	out.close();
	}
}
