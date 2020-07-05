import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] codigo = {"A001","A018","A123","A555","A357"};
		String[] nombre = {"Ronald Velasquez","Antony Velasquez","Ariana Tordoya","Nahomi Cordova","Jony Cabrera"};
		int[] nota = {8,15,14,10,18};
	
		
		System.out.println("Ingrese código a buscar: ");
		String valor_codigo = sc.nextLine();
		
		int posicion = -1;
		
		for (int x = 0; x <= 4; x++) {
			if (valor_codigo.equals(codigo[x])){
				posicion = x;
				break;
			}
		for (int j=0 ; j<=4; j++) {
			}
		}
		
		if (posicion == -1) {
			System.out.println("Código no econtrado");
		}
		else {
			
			String estado = "Desaprobado";
			if (nota[posicion] >=11) estado ="Aprobado";
			System.out.println("Código Econtrado");
			System.out.println("Nombre: " + nombre[posicion]);
			System.out.println("Nota: " + nota[posicion]);
			System.out.println("Estado: " + estado);
		}
	}
	

}
