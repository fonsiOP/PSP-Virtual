
public class Gato extends Animal{

	String color;
	
	Gato(String n, int e, double p, String c) {
		super(n, e, p);
		this.color=c;
		
	}
	
	void maullar() {
		System.out.println("Miau Miau!");
	}

}
