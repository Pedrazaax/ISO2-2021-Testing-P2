package C01.Testing_P2;

import org.junit.*;

public class MainTest {
	
	@Test
	public void main () {

		int plazas = 50;
		int casos = 256;
		
		PasajeroTest pasajero = new PasajeroTest(78, false, false, false, false);
		CalcularPrecioTest p = new CalcularPrecioTest();
		
		int nivel = p.calcularNivel(casos);
		
		int plazasN = p.calcularPlazasNormales(plazas, nivel);
		
		
		double precio = p.CalcularPrecioBillete(nivel, pasajero.getEdad(), pasajero.isProfesional(),
					pasajero.isEnfermo(), pasajero.isSintomas(), pasajero.isContactoReciente(), plazas, plazasN);
		
		//Imprime el resultado
		if (precio != 0) System.out.println("El precio final es "+ precio);
		else {System.out.println("No se puede vender");}
	}
	
}
