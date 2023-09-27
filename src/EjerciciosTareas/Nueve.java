package EjerciciosTareas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Nueve {
	public static void main(String[] args) throws IOException {
		File documento = new File ("textos\\documento.txt");
		documento.createNewFile();
		String [] clase = new String [4];
		clase [0] = "manoliotu garzia";
		clase [1] = "carmenn valdes";
		clase [2] = "miguelin sanchez";
		clase [3] = "tilin melocoton";
		try { 
			BufferedWriter out=new BufferedWriter (new FileWriter(documento, true));
			for(int i=0;i<clase.length;i++) {
				out.write(clase[i] + "\n");
			}
			out.close();
		}catch (Exception e) {
			System.out.println();
	}

		
	}
}
