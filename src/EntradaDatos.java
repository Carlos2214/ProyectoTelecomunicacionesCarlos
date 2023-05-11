import java.util.Scanner;

public class EntradaDatos {
	
	int metros(){
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros cuadrados ");
		int a;
		a = n1.nextInt();
				
		return a;		
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
		case 1: estilo="moderno";
				return estilo;
		case 2: estilo="chipendale";
				return estilo;
		default: return "estilo no conocido";
		
	
				
		}
		}
	
	String Sistemasdetransmision() {
		Scanner n2 = new Scanner(System.in);
		System.out.println("Introducir el tipo de sistema:"
				+ "1: electrica "
				+ "2: optica"
				+ "3: radiofrecuencia");
		String estilo;
		int selector;
		selector = n2.nextInt();
		
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