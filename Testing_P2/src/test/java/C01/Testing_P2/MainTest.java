package C01.Testing_P2;

import org.junit.*;

public class MainTest {
	
	@Test
	public void main () {

		int plazas = 50;
		int casos = 256;
		
		Pasajero pasajero = new Pasajero(78, false, false, false, false);
		CalcularPrecio p = new CalcularPrecio();	
		
		double precio;
		
		precio = p.CalcularPrecioBillete(0, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 0));
		precio = p.CalcularPrecioBillete(0, 68, false, true, false, false, 0, p.calcularPlazasNormales(0, 0));
		precio = p.CalcularPrecioBillete(0, 68, false, true, false, false, 20, p.calcularPlazasNormales(0, 0));
		precio = p.CalcularPrecioBillete(1, 80, true, false, false, false, 20, p.calcularPlazasNormales(20, 1));
		precio = p.CalcularPrecioBillete(1, 80, true, false, false, false, 0, p.calcularPlazasNormales(20, 1));
		precio = p.CalcularPrecioBillete(1, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 1));
		precio = p.CalcularPrecioBillete(2, 80, true, false, false, false, 20, p.calcularPlazasNormales(20, 1));
		precio = p.CalcularPrecioBillete(2, 80, true, false, false, false, 0, p.calcularPlazasNormales(20, 1));
		precio = p.CalcularPrecioBillete(2, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 1));
		precio = p.CalcularPrecioBillete(3, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 3));
		precio = p.CalcularPrecioBillete(3, 16, false, false, false, false, 20, p.calcularPlazasNormales(20, 3));
		precio = p.CalcularPrecioBillete(4, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 4));
		precio = p.CalcularPrecioBillete(4, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 4));
		precio = p.CalcularPrecioBillete(4, 80, false, false, false, false, 20, p.calcularPlazasNormales(20, 4));
		precio = p.CalcularPrecioBillete(4, 80, true, false, false, false, 20, p.calcularPlazasNormales(20, 4));
		
		//Imprime el resultado
		if (precio != 0) System.out.println("El precio final es "+ precio);
		else {System.out.println("No se puede vender");}
		
		
	}
	
}
