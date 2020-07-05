import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] lista = new int [3][4];
		
		int num_mayor = 0;
		int num_menor= 0;
		int suma = 0;
		
		
		for (int f =0; f <=2; f++) {
			for (int c=0; c<=3; c++) {
				System.out.println("Fil." + (f + 1) + "Col." + (c+1));
				lista[f][c] = sc.nextInt();
				
				if (f== 0 && c ==0) num_mayor = lista[0][0];
				
				if (lista[f][c] >num_mayor)
					num_mayor = lista[f][c];
				if(f== 0 && c ==0) num_menor = lista[0][0];
				if (lista[f][c] <num_menor)
					num_menor = lista[f][c];
				suma=suma+lista[f][c];
			}
			
		}
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Número mayor:" + num_mayor);
		System.out.println("Número menor:" + num_menor);
		System.out.println("Sumatoria: " + suma);

	}

}
