
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esta es la clase principal de mi proyecto de telecomunicaciones
		//para la asignatura de ticII
		//Aqui se incluye el funcionamiento
		
		EntradaDatos ed = new EntradaDatos();
		int metros = ed.metros();
		
		//int habitaciones = ed.habitaciones();
		
		//String estilo = ed.estilos();
		
		
		
		//Telecomunicaciones c1 = new Telecomunicaciones();
		//int presupuesto = c1.presupuesto(metros, habitaciones, estilo );
		
		String Radiocomunicaciones = ed.Radiocomunicaciones();
		System.out.println(Radiocomunicaciones);
		//String estilos2 = ed.estilos2();
		System.out.println(ed.Telefonía());
		System.out.println(ed.Sistemasdetransmision());
		
	}

}
