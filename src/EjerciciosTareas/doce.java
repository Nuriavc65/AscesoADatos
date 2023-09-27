package EjerciciosTareas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class doce {

	public static void main(String[] args) throws IOException{
		File agenda = new File("Tetxtos\\ejer12.txt");
		agenda.createNewFile();
		ArrayList<String>contacto = new ArrayList<>();
		String nombre = "Sa ";
		contacto.add(nombre);
		System.out.println(contacto);
	}

}
