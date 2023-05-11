
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esta es la clase principal de mi proyecto de telecomunicaciones
		//para la asignatura de ticII
		//Aqui se incluye el funcionamiento
		
		EntradaDatos ed = new EntradaDatos();
		int metros = ed.metros();
		
		int cables = ed.cables();
		
		
		
		
		Telecomunicaciones c1 = new Telecomunicaciones();
		//El precio por metro de cable es de 4 euros
		int producto = cables * 4 * metros;
		String Radiocomunicaciones = ed.Radiocomunicaciones();
		System.out.println(Radiocomunicaciones);
		//String estilos2 = ed.estilos2();
		System.out.println(ed.Telefonía());
		System.out.println(ed.Sistemasdetransmision());
		System.out.println("El precio que vamos a tener que pagar por el cableado es de: " + producto);
	}

}
