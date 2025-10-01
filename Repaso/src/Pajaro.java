
public class Pajaro extends Animal {
	
	// Atributos
	String colorPlumas;
	
	
	// Métodos
	Pajaro(String n, int e, double p, String cp) {
		super(n, e, p);
		this.colorPlumas=cp;
	}
	
	void piar() {
		System.out.println("pio pio!");
	}



}
