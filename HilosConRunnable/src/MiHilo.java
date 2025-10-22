
public class MiHilo implements Runnable{
	
	String nombre;
	boolean x = true;
	
	MiHilo(String name){
		this.nombre=name;
	}

	@Override
	public void run() {
		
		while(x) {
			System.out.println("Hola soy un hilo "+this.nombre+"y esta es mi ejecución nº: "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
