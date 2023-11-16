package test;

public class Ejemplo_Clases_Objetos_DemoVehiculos {

	public static void main(String[] args) {
		
		Ejemplo_Clases_Objetos_Vehiculo minivan = new Ejemplo_Clases_Objetos_Vehiculo();
		
		int rango;
		
		//ASIGNAR VALORES A LOS CAMPOS DE MINIVAN
		
		minivan.pasajeros=9;
		minivan.capacidad=15;
		minivan.kmh=20;
		
		//CALCULAR EL RANGO AUSMIENDO TANQUE LLENO DE GASOLINA
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar:" + minivan.pasajeros + " pasajeros con un rango de " + rango + "KM");

	}

}
