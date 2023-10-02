package PrimerTrimestre.Tema1;

import java.io.File;
import java.io.IOException;

public class EntregaActividad1 {

	public static void main(String[] args) throws IOException {
		String ruta =".";
		if(args.length>=1) {
			ruta=args[0];
		}else if(args.length==0){
			System.out.println("NO EXISTE ESA RUTA DIRECTORIO");
		}
		File fichero = new File(ruta);
		fichero.createNewFile();
		if(!fichero.exists()) {
			System.out.println("no existe el fichero o directorio" +ruta);
		}else {
			if(fichero.isDirectory()) {
				System.out.println(ruta+ "ruta del directorio");
				File[]ficheros = fichero.listFiles();
			}else {
				System.out.println(fichero.getName()+"es un fichero");
			}
		}
	}

}
