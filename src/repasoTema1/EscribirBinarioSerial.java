package repasoTema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.xml.sax.InputSource;

public class EscribirBinarioSerial {

	public static void main(String[] args) {
		String ruta = "";
		File fichero = new File( ruta +"binarioObjetos.txt");
		try {
			fichero.createNewFile();
			//herramientas para escribir el fichero
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero));
			//cremos una lista para los nombre y lasd edades del objeto
			ArrayList <String> listaNombres = new ArrayList<String>(
					Arrays.asList("Nuria","Carlos","Naxo","pablo"));
			ArrayList <Integer> listaEdades = new ArrayList<Integer>(
					Arrays.asList(19,19,20,23));
			//recorremos las listas
			for(int i=0;i<listaNombres.size();i++) {
				//escribimos el objeto PersonalSerial con sus atributos
				out.writeObject( new PersonalSerial (listaEdades.get(i), listaNombres.get(i)));
			}
			out.close();
		} catch (Exception e) {
		}
		try {
			//herramienta de lectura del fichero
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(fichero));
			while(true) {
				//mostrar por consola el contenido del fichero
				System.out.println(input.readObject());
			}
		} catch (Exception e) {
		}
	}

}
