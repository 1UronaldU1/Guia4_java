
public class Caso6 {

	public static void main(String[] args) {
		String datos[][];
		datos = new String[2][3];
		
		datos[0][0] = "Ronald Velasquez";
		datos[0][1] = "Ariana Tordoya";
		datos[0][2] = "Antony Velasquez";
		
		datos[1][0] = "San Juan de Miraflores";
		datos[1][1] = "Rinconada";
		datos[1][2] = "San borja";
		
		for (int f = 0; f <=1; f++) {
			System.out.println("Fila " + (f +1));
			System.out.println("==============");
			for(int c = 0; c <= 2; c++) {
				System.out.println("Columna " + (c+1) + ": " + datos[f][c]);
				
			}
		}
		

	}

}
