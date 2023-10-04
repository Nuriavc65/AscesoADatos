package EjerciciosEnviar;

import java.io.File;
import java.io.IOException;

public class Dos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String ruta =".\\";
		File directorio = new File(ruta +"diretorioEjEntregar");
		if(directorio.exists()) {
			if(directorio.list().length>0) {
				System.out.println("el directorio contiene archivos");
			}
			else {
				System.err.println("el directorio no contiene archivos");
				directorio.delete();
				System.out.println("el directorio se ha borrado");
			}
		}else
			System.err.println("El directorio no existe");
		
	}

}
