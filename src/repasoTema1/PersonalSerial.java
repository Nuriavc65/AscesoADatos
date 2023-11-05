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
	public void setAge(int edad) throws ExceptionPersona{
		if(edad<0) {
			throw new ExceptionPersona("no se pueden tener -0 años");
		}
		this.edad = edad;
	}
	
}
