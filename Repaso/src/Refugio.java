import java.util.ArrayList;

public class Refugio {
	ArrayList<Animal> animales = new ArrayList<>(); 
	
	void agregarAnimal(Animal a) {
		this.animales.add(a);
	}
	
	void mostrarAnimales() {
		for(Animal animal: this.animales) {
			System.out.println(animal.toString());
		}
	}
	
	void hacerSonidos() {
		for(Animal animal: this.animales) {
			animal.hacerSonido();
		}
	}
	
	

}
