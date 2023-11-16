package clases_y_Objetos;

public class Demo_Vehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		// asignamos valores a los campos de miniva
		
		minivan.capacidad=9;
		minivan.pasajeros= 15;
		minivan.kmh=20;

		// Calcular el rango de movimiento asumiendo el tanque lleno
		
		rango=minivan.capacidad*minivan.kmh;
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
	}

}
