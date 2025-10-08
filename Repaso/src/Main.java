
public class Main {

	public static void main(String[] args) {
		
		Perro tostada = new Perro("Tostada", 1, 9, "Mezcla");
		Gato carlos = new Gato("Carlos", 6, 6, "negro y blanco");
		Pajaro perico = new Pajaro("perico", 1, 1, true);
		
		Refugio refugio = new Refugio();
		refugio.agregarAnimal(tostada);
		refugio.agregarAnimal(carlos);
		refugio.agregarAnimal(perico);
		
		refugio.mostrarAnimales();
		
		refugio.hacerSonidos();
		
		perico.puedeVolar=false;
		
		
					
	}
	

}
