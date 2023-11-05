package repasoTema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class lecturaFichero {
	public static void main(String[] args) throws IOException {
		File archivo = new File("Textos\\text.txt");
		if(archivo.exists()){
			
			//instacias de buufered
			FileReader lectura = new FileReader(archivo);
			BufferedReader reader = new BufferedReader(lectura);
			
			// leer todas las lineas del fichero
			String linea  = reader.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = reader.readLine(); //actualizar la linea
			}System.out.println("final fichero");
		}else {
			System.out.println("El fichero no existe");
		}
	}
}
