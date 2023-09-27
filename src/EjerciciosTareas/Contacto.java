package EjerciciosTareas;



public class Contacto implements Comparable{
	String nombre;
	String DNI;
	int telef;
	
	Contacto(String nombre, String DNI, int telef){
		this.nombre = nombre;
		this.DNI = DNI;
		this.telef = telef;
	}

	@Override
	public int compareTo(Object o) {
		if(nombre.equals(o)) {
			return 0;
		}if(DNI.equals(o)){
			return 0;
		}if(telef == telef) {
			return 0;
		}
		return 0;
	}
	
	
}
