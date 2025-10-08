public class Pajaro extends Animal {
	
	// Atributos
	private boolean puedeVolar;
	
	



	// Métodos
	Pajaro(String n, int e, double p, boolean pV) {
		super(n, e, p);
		this.puedeVolar=pV;
	}
	


	@Override
	public void hacerSonido() {
		System.out.println("pio pio!");
		
	}

	
	public boolean isPuedeVolar() {
		return puedeVolar;
	}



	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}



}
