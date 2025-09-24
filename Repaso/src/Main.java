
public class Main {
	
	
	static int globo=99;

	public static void main(String[] args) {
		int globo_azul=3;

		System.out.println("Hola a todos");
		int num = 0;

		// Condicionales
			// if
			if(num>0) {
				//instruccion 1
			}else if(num==0){
				//instruccion 2
			}else {
				//instruccion 3
			}
			// switch
			System.out.println(globo);
			System.out.println(globo_azul);
		//bucles
			
			//while
			while(num<5) {
				num++;
			}// salimos con num =5
			for(int x=0;x<10;x++) {
				System.out.println("x vale: "+x);
			}
			do {
				num++;
			}while(num == 6);
			
			
			int patata = 0;
			
			patata = sumar(4,5);
			
			
					
	}
	
	static int sumar(int a, int b){
		int c = a + b;
		System.out.println(globo);
		//System.out.println(globo_azul);
		return c;
	}

	
}
