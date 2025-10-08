public class Gato extends Animal{

	private String color;
	


	Gato(String n, int e, double p, String c) {
		super(n, e, p);
		this.color=c;
		
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Miau Miau!");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
