
public class Persona {
	
	private String nombre, apellidos;
	private int edad;
	
	/*
	 * public Persona() {
	 * }
	 */
	
	public Persona() {
		nombre="Marisa";
		apellidos="González";
		edad=23;
		System.out.println("Se crea una persona.");
	}
	
	public void saludar() {
		System.out.println("¡Hola!");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void imprimirNombre() {
		System.out.println(nombre);
	}
	
	
}
