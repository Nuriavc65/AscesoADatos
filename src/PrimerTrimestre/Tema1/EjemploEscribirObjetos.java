package PrimerTrimestre.Tema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploEscribirObjetos {

	public static void main(String[] args) {
		Persona persona; // llamo a al Objeto Persona
		String ruta = "\\Textos";
		File archivo = new File(ruta + "FichPersona.dat");
		try{
			// creo los Streams para escribir el ficheri con los objetos
			FileOutputStream out = new FileOutputStream(archivo);
			ObjectOutputStream object = new ObjectOutputStream(out);
			
			String [] nombres = {"Ana","Luis","Miguel","Alicia","Pedro","Manuel","Andres","Julio","Antonio"};
			int [] edades = {14,15,13,15,16,12,16,14,13};
			System.out.println("datos personales grabados");
			for(int i=0;i<edades.length;i++) { // uso el for para recorrer los datos uno a uno
				persona = new Persona(nombres[i],edades[i]); // dentro de persona añado las edades y los nombres
				object.writeObject(persona); //escribo los datos de persona en el fichero
				System.out.println("grabo los datos de persona");
			}
			object.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
