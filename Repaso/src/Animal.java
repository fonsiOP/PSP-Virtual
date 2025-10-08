public abstract class Animal {
	

	protected String nombre;
	protected int edad;
	protected double peso;
	
	
	Animal(String n, int e, double p){
		this.nombre=n;
		this.peso=p;
		this.edad=e;
	}
	
	public abstract void hacerSonido();
	
	public String toString() {
		return "Nombre: "+this.nombre+", edad: "+this.edad+", peso: "+this.peso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


}
