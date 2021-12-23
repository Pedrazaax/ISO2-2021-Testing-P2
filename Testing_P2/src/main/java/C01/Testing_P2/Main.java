package C01.Testing_P2;

public class Main {
	
	public static void main(String[] args) {

		int plazas = 50;
		int casos = 256;
		
		Pasajero pasajero = new Pasajero(78, false, false, false, false);
		CalcularPrecio p = new CalcularPrecio();
			
		double precio;
		
		precio = p.CalcularPrecioBillete(0, 20, true, false, false, false, 20, p.calcularPlazasNormales(20, 0));
		
		//Imprime el resultado
		if (precio != 0) System.out.println("El precio final es "+ precio);
		else {System.out.println("No se puede vender");}
	}
	
}
