
public class Cabeza {

	private int numeroOjos;
	
	public Cabeza() {
		System.out.println("Se crea una cabeza 'normal' con 2 ojos");
		numeroOjos=2;
	}
	
	public Cabeza(int numeroOjos) {
		System.out.println("Se crea una extraña cabeza con "+numeroOjos+ " ojos");
		this.numeroOjos=numeroOjos;
	}
	
}
