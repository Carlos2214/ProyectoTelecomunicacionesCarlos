import java.util.Scanner;

public class EntradaDatos {
	
	int metros(){
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros de cable necesarios ");
		int a;
		a = n1.nextInt();
				
		return a;		
	}
	
	int cables(){
		Scanner n2 = new Scanner(System.in);
		System.out.println("Introducir el numero de cables que vamos a utilizar ");
		int b;
		b = n2.nextInt();
				
		return b;		
	}
	
	
	
	String Radiocomunicaciones() {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir el tipo de onda radial:"
				+ "1: AM "
				+ "2: FM");
		String estilo;
		int selector;
		selector = n1.nextInt();
		
		switch(selector) {
		case 1: estilo="AM";
				return estilo;
		case 2: estilo="FM";
				return estilo;
		
		default: return "estilo no conocido";
		
		
		
		
		}
	}
	
	String Telefonía() {
		Scanner n2 = new Scanner(System.in);
		System.out.println("Introducir metodo requerrido:"
				+ "1: Satelites "
				+ "2: torres de emision");
		String estilo;
		int selector;
		selector = n2.nextInt();
		
		switch(selector) {
		case 1: estilo="Satelites";
				return estilo;
		case 2: estilo="Torres de emision";
				return estilo;
		default: return "estilo no conocido";
		
	
				
		}
		}
	
	String Sistemasdetransmision() {
		Scanner n3 = new Scanner(System.in);
		System.out.println("Introducir el tipo de sistema:"
				+ "1: electrica "
				+ "2: optica"
				+ "3: radiofrecuencia");
		String estilo;
		int selector;
		selector = n3.nextInt();
		
		switch(selector) {
		case 1: estilo="electrica";
				return estilo;
		case 2: estilo="optica";
				return estilo;
		case 3: estilo="radiofrecuencia";
		return estilo;
		default: return "estilo no conocido";
	
	
	
		
		}
	}
	
}