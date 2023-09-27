package EjerciciosTareas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class quince {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("INSERTE NUMEROS: ");
		int numero = Integer.parseInt(in.readLine());
		File binario = new File("Textos\\15.txt");
		binario.createNewFile();
		do {
			System.err.println("inser num");
			FileOutputStream fis = new FileOutputStream(binario);
			ObjectOutputStream escribir = new ObjectOutputStream(fis);
			escribir.writeInt(numero);
		}while(numero > 0);
			System.err.println("FINAL DE LISTA");
			
		
	}

}
