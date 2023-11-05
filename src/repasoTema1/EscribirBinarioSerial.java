package repasoTema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class EscribirBinarioSerial {

	public static void main(String[] args) {
		File fichero = new File("Textos\\binarioObjetos.txt");
		try {
			fichero.createNewFile();
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero));
			ArrayList <String> listaNombres = new ArrayList<String>(
					Arrays.asList("Nuria","Carlos","Naxo","pablo"));
			ArrayList <Integer> listaEdades = new ArrayList<Integer>(
					Arrays.asList(19,19,20,23));
			for(int i=0;i<listaNombres.size();i++) {
				out.writeObject( new PersonalSerial (listaEdades.get(i), listaNombres.get(i)));
			}
			out.close();
		} catch (Exception e) {
		}
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(fichero));
			while(true) {
				System.out.println(input.readObject());
			}
		} catch (Exception e) {
		}
	}

}
