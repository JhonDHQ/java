package test;

public class Ejemplo_Metodos {

	public static void main(String[] args) 
	{
	
		int resultado=suma(10,20); //LLAMAMOS AL METODO SUMA	
		System.out.println(resultado);
		
		
		String car = carros(0);
		System.out.println (car);

	}
	
	public static int suma(int a,int b)
	{
		int c =a+b;
		return c;
	}
	
	public static String carros(int a)
	{
		String [] cars= {"Volvo", "BMW", "Ford"};
		return cars [a];
	}

}
