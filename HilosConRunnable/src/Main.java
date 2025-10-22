
public class Main {

	public static void main(String[] args) {

		Thread hilo1 = new Thread(new MiHilo("sdfg"));
		Thread hilo2 = new Thread(new MiHilo("dgfgg"));
		Thread hilo3 = new Thread(new MiHilo("sdgag"));
		
		hilo1.start();
		hilo2.start();
		hilo3.start();

	}

}
