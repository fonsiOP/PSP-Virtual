
public class MiHilo extends Thread{
	
	String nombre;
	
	MiHilo(String nom){
		this.nombre=nom;
		
	}
	

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hola soy el hilo "+this.nombre +" y esta es mi ejecución nº: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
