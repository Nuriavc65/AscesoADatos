package EjerciciosEnviar;

import java.io.File;

public class Uno {
	public static void main(String[] args) {
		String ruta = ".//";
		File directorioEj2 = new File(ruta + "directorioEjEntregar");
		directorioEj2.mkdir();
		if(directorioEj2.exists()) {
			System.out.println("directorio creado");
			File archivo1 = new File(directorioEj2,"archivo1");
			File archivo2 = new File(directorioEj2,"archivo2");
			File archivoNuevo = new File(directorioEj2,"archivoNuevo");
			try {
				archivo1.createNewFile();
				archivo2.createNewFile();
				System.out.println("archivos creados");
				archivo1.renameTo(archivoNuevo);
				System.out.println("nombre cambiado");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else
			System.err.println("direcorio no creado");
	}
}
