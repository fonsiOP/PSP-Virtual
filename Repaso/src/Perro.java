
public class Perro extends Animal{

	String raza;
	
	Perro(String n, int e, double p, String r) {
		super(n, e, p);
		this.raza=r;
		
	}
	
	void ladrar() {
		System.out.println("Guau Guau!");
	}

}
