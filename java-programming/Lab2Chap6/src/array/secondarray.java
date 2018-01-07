package array;
import java.util.Scanner;

public class secondarray {

	public static void main(String args[]) {
		
		int[] data = new int[5];
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		for (int i = 0; i< 5; i++) {
			System.out.print("Introduce un numero:\t");
		    numero = scanner.nextByte();
		    data[i] = numero;
		}
		
		for(int n = 0; n<5; n++ )
			System.out.println("El numero es -> " + data[n] * 2);
	    
	     
		scanner.close(); 
				
		
		//for(int numero : data)
		//	System.out.println("El numero es -> " + numero * 2);
		
	}
}
