
public class Caso1 {

	public static void main(String[] args) {
		// Declaraci�n del Array
		String nombre[];
		nombre = new String[4];
		
		//Asignaci�n de valores
		nombre[0] = "Ronald";
		nombre[1] = "Ariana";
		nombre[2] = "Chroe";
		nombre[3] = "Antony";
		
		for (int i = 0; i <= 3; i++)
			System.out.println("Nombre " + (i + 1) + ": " + nombre[i]);
	}

}
