
public class Aplicacion {
	
	public static void main(String[] args) {
		Persona p=new Persona(); //Se crea una persona
		p.saludar(); // ¡Hola!
		String n=p.getNombre(); //no muestra nada por pantalla
		System.out.println(n); //Marisa
		Persona m=new Persona();
		System.out.println(m.getNombre()); //Marisa
		System.out.println(m.getApellidos()); //González
		
	}

}
