package condicionales;

public class Ejemplo_If_Anidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperatura = 26;
		
		if (temperatura >15) 
		{
			if (temperatura > 25) 
			{
				System.out.println("Que Calor!!");
			}else 
			{
				System.out.println("Vamos a Caminar");
			}
		}else 
		{
			System.out.println("Esta agradable el clima");
		}

	}

}
