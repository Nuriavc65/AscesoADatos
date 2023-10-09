package PrimerTrimestre.Tema1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EjeemploLeerObjetos {

	public static void main(String[] args) {
		String ruta = "\\Textos"; 
		File archivo = new File (ruta + "FichPersona.dat");
		try {
			//creo los Streams para leer el fichero 
			FileInputStream Out = new FileInputStream(archivo);
			ObjectInputStream object = new ObjectInputStream(Out);
			//creo un arrayList para guardar todos los objetos personas el archivo
			ArrayList <Persona> personas = new ArrayList<>();
			Persona aux = (Persona) object.readObject(); // se lee el objeto persona como objeto
			while(aux != null) {
				personas.add(aux);
				System.out.println(personas);
			}
			object.close();
			Out.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
		
		
	}


