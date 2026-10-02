
public class Aplicacion {
	
	public static void main(String[] args) {
		Persona p=new Persona("Pepe","Gotera",60,2); //Se crea una persona
		p.saludar(); // ¡Hola!
		String n=p.getNombre(); //no muestra nada por pantalla
		System.out.println(n); //Pepe
		System.out.println(p.getApellidos()); //Gotera
		System.out.println(p.getEdad()); //60
		Persona m=new Persona("Luisa","Martínez",52,9);
		System.out.println(m.getNombre()); //Luisa
		System.out.println(m.getApellidos()); //Martínez
		System.out.println(m.getEdad()); //52
	}

}
