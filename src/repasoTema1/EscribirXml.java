package repasoTema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EscribirXml {

	public static void main(String[] args) {
		File fichero = new File ("Textos\\binarioObjetos.txt");
		ArrayList <PersonalSerial> personas = new ArrayList <>();
		ObjectInputStream input;
		try {
			input = new ObjectInputStream(new FileInputStream(fichero));
			try {
				while(true) {
					personas.add((PersonalSerial) input.readObject());
				}
			} catch (Exception e) {}
			input.close();
			//XStream xs = new XStream ();
			//xs.alias ("personas",personas);
			//xs.alias ("persona",PersonalSerial.class);
			//xs.toXML (personas , new FileOutputStream("Textos\\xmlPersona.xml"));
		}catch(Exception e){}
	}

}
