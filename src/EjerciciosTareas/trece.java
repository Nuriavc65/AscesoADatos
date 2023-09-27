package EjerciciosTareas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class trece {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserte double: ");
		double consola = Double.parseDouble(in.readLine());
		File binario = new File("Textos\\13and14.txt");
		binario.createNewFile();
		FileOutputStream bi = new FileOutputStream(binario);
		ObjectOutputStream escribir = new ObjectOutputStream(bi);
			escribir.writeDouble(consola);
			System.out.println("DATOS ESCRITOS");
			escribir.close();
		bi.close();
	}
}
