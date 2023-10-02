package EjerciciosTareas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class quince {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("INSERTE NUMEROS: ");
		int numero  = Integer.parseInt(in.readLine());
		File archivo = new File("Textos\\15.txt");
		archivo.createNewFile();
		FileOutputStream bi = new FileOutputStream(archivo);
		ObjectOutputStream write = new ObjectOutputStream(bi);
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
		while (numero != -1) {
			if(numero >= 0){
				write.writeInt(numero);
			}else {
				System.err.println("numero negativo");
			}
			numero = Integer.parseInt(in.readLine());
		}
		write.close();
		bi.close();
	}
}
