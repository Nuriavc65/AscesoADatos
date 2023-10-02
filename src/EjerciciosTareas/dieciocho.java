package EjerciciosTareas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class dieciocho {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		System.out.println("INSERTE LINEA: ");
		File fichero = new File ("Textos\\18.txt");
		fichero.createNewFile();
		FileOutputStream fis = new FileOutputStream(fichero);
		ObjectOutputStream write = new ObjectOutputStream(fis);
			do {
				write.writeBytes(linea);
				linea = in.readLine();
			}while(!linea.equals(""));
		write.close();
		fis.close();
	}

}
