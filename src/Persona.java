
public class Persona {
	
	private String nombre, apellidos;
	private int edad;
	private Cabeza unaCabeza;
	
	/*
	 * public Persona() {
	 * }
	 */
	
	public Persona(String nombrePersona, String apellidosPersona, int edadPersona, int numeroOjos) {
		nombre=nombrePersona;
		apellidos=apellidosPersona;
		edad=edadPersona;
		unaCabeza=new Cabeza(numeroOjos);
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
	
	public int getEdad() {
		return edad;
	}
	
	public void imprimirNombre() {
		System.out.println(nombre);
	}
	
	
}
