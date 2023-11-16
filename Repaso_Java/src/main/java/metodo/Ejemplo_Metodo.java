package metodo;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = suma(10,54);
		
		String marca = vehiculo(2);
		System.out.println("El vehiculo es: "+ marca);
		
		
		System.out.println("La suma es: "+ resultado);

	}
	public static int suma (int a, int b) 
	{
		int c=a+b;
		
		return c;
	}
	
	public static String  vehiculo (int a) 
	{
		String[] vehiculo = {"Volvo","Ford", "Mazda"};
		
		return vehiculo[a];
	
	}

}
