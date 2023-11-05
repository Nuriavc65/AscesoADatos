package repasoTema1;

import java.io.Serializable;

public class PersonalSerial implements Serializable{
	String nombre;
	int edad;
	
	public PersonalSerial(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PersonalSerial [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
