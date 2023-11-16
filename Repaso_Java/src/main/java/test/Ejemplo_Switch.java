package test;

public class Ejemplo_Switch {

	public static void main(String[] args) {

		int i = 3;
		
		switch (i) 
		{
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es Uno");
			break;
		case 2:
			System.out.println("i es Dos");
			break;
		case 3:
			System.out.println("i es Tres");
			break;
		case 4:
			System.out.println("i es Cuatro");
			break;
		default:
			System.out.println("i es mayor que Cuatro");
			break;
		
		}

	}

}
