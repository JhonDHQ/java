package test;

public class Ejemplo_IF_Anidado 
{

	public static void main(String[] args) 
	{

		int temperatura=16; // CREAMOS UNA VARIABLE DE TIPO ENTERO
		
		if (temperatura > 15) // SI I ES Mayor A 15 
			{
				if(temperatura >20) 
					{
						System.out.println("Que Calor!!!!!!"); // RESPUESTA CONDICION
					}
				else 
					{
						System.out.println("Mucho Frio!!"); //RESPUESTA CONDICION
					}
			}
		else 
			{
				System.out.println("A descanzar!!!!!"); //RESPUESTA CONDICION
			}
		
	}

}
