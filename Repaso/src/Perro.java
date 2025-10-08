public class Perro extends Animal{

	private String raza;
	
	Perro(String n, int e, double p, String r) {
		super(n, e, p);
		this.raza=r;
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("Guau Guau!");
	}

}
