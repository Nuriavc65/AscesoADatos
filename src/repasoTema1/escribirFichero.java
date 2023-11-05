package repasoTema1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escribirFichero {

	public static void main(String[] args) throws IOException {
		//declaracion y creacion del file
		File fichero = new File("Textos\\text.txt"); 
		fichero.createNewFile();
		
		//Herramientas de escritura. Instancias.
		FileWriter writer = new FileWriter(fichero, true);
		BufferedWriter escribir = new BufferedWriter(writer);
		
		//Escritura de fichero
		escribir.write("hola");
		
		escribir.close();
		writer.close();
		
	}

}
