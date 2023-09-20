package PrimerTrimestre.Tema1;

import java.io.File;

public class DirectorioEjemplo {

	public static void main(String[] args) {
		File directorio = new File(".\\prueba");
		if (directorio.mkdir()) {
		 System.out.println("Directorio creado");
		 }else {
			 System.err.print("Directorio no creado");
			 if (directorio.exists())
				 System.err.println("-> directorio ya existe");
			 else System.err.println("Razón desconocida");
		 }
	}

}
