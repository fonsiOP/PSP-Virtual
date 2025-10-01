
public class Animal {
	
	String nombre;
	int edad;
	double peso;
	
	
	Animal(String n, int e, double p){
		this.nombre=n;
		this.peso=p;
		this.edad=e;
	}
	
	void mostrarDatos() {
		System.out.println("El animal "+ this.nombre +" tiene "+ this.edad + " años y pesa " + this.peso + " kg");
	}

}
