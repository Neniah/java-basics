package examplearg;

public class examplearg {
	
	public static void main(String[] args) {
		variosParametros("Juan", true, 15, 20, 14);
	}
	
	public static void variosParametros(String nombre, boolean valido, int... numeros) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Valido: " + valido);
		
		for(int numero : numeros) {
			System.out.println("El numero es:" + numero);
		}
	}
}
